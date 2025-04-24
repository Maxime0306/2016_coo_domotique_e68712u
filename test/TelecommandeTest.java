
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
}
