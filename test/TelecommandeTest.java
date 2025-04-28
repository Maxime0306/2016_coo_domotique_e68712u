
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TelecommandeTest {


    @Test
    public void testAjouterLampe_lvide() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");
        Telecommande t = new Telecommande();

        // Action
        t.ajouterPeri(l);

        // Vérification : est-ce que la lampe est bien dans la liste ?
        assertTrue(t.getPeri().contains(l), "La lampe devrait être ajoutée à la télécommande");
    }

    @Test
    public void testAjouterLampe_l1elmt() {
        // Préparation des données
        Lampe l = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");
        Telecommande t = new Telecommande();

        // Action
        t.ajouterPeri(l);
        t.ajouterPeri(l2);

        // Vérification : est-ce que la lampe est bien dans la liste ?
        assertTrue(t.getPeri().contains(l2), "La lampe devrait être ajoutée à la télécommande");
    }

    @Test
    public void testActiverLampe_position0() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        t.ajouterPeri(l1);
        t.ajouterPeri(l2);

        t.activerPeri(0);

        assertTrue(l1.isAllume(), "La lampe à l’index 0 doit être allumée");
        assertFalse(l2.isAllume(), "La lampe à l’index 1 ne doit pas être allumée");
    }

    @Test
    public void testActiverLampe_position1() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        t.ajouterPeri(l1);
        t.ajouterPeri(l2);

        t.activerPeri(1);

        assertFalse(l1.isAllume(), "La lampe à l’index 0 ne doit pas être allumée");
        assertTrue(l2.isAllume(), "La lampe à l’index 1 doit être allumée");
    }

    @Test
    public void testActiverLampe_inexitante() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Lampe l2 = new Lampe("lampe2");

        t.ajouterPeri(l1);
        t.ajouterPeri(l2);

        //verification
        IndexOutOfBoundsException e = assertThrows(IndexOutOfBoundsException.class, () -> {
            t.activerPeri(2);
        });
    }

    @Test
    public void testAdapterConstructeur() {
        Cheminee cheminee = new Cheminee();
        Adapter adapter = new Adapter(cheminee);

        assertEquals(0, adapter.getIntensite(), "L'intensité initiale devrait être 0");
    }

    @Test
    public void testAdapterAllumer() {
        Cheminee cheminee = new Cheminee();
        Adapter adapter = new Adapter(cheminee);

        adapter.allumer();

        assertEquals(10, adapter.getIntensite(), "L'intensité après allumage devrait être 10");
    }

    @Test
    public void testAdapterEteindre() {
        Cheminee cheminee = new Cheminee();
        cheminee.changerIntensite(50); // On met une valeur non nulle
        Adapter adapter = new Adapter(cheminee);

        adapter.eteindre();

        assertEquals(0, adapter.getIntensite(), "L'intensité après extinction devrait être 0");
    }

    @Test
    public void testTelecommandeAvecAdapter() {
        Telecommande t = new Telecommande();
        Cheminee cheminee = new Cheminee();
        Adapter adapter = new Adapter(cheminee);

        t.ajouterPeri(adapter);

        // Vérifier que l'adaptateur est bien ajouté
        assertTrue(t.getPeri().contains(adapter), "L'adaptateur devrait être dans la télécommande");

        // Activer la cheminée via la télécommande
        t.activerPeri(0);
        assertEquals(10, adapter.getIntensite(), "L'intensité après activation devrait être 10");

        // Désactiver la cheminée via la télécommande
        t.desactiverPeri(0);
        assertEquals(0, adapter.getIntensite(), "L'intensité après désactivation devrait être 0");
    }

    @Test
    public void testActiverToutAvecAdapter() {
        Telecommande t = new Telecommande();
        Lampe l1 = new Lampe("lampe1");
        Cheminee cheminee = new Cheminee();
        Adapter adapter = new Adapter(cheminee);

        t.ajouterPeri(l1);
        t.ajouterPeri(adapter);

        t.activerTout();

        assertTrue(l1.isAllume(), "La lampe devrait être allumée");
        assertEquals(10, adapter.getIntensite(), "L'intensité de la cheminée devrait être 10");
    }

}
