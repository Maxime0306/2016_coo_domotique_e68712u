import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TelecommandeTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    //    ajout d'une lampe à une télécommande vide ;
    public void ajoutLampe0(){
        Telecommande t1 = new Telecommande();
        t1.ajouterLampe(new Lampe("lampe1"));
        assertEquals(1,t1.getLampes().size(), "la taille devrait être de 1");
    }

    @Test
    //    ajout d'une lampe à une télécommande avec 1 élément ;
    public void ajoutLampe1(){
        Telecommande t1 = new Telecommande();
        t1.ajouterLampe(new Lampe("lampe1"));
        t1.ajouterLampe(new Lampe("lampe2"));
        assertEquals(2,t1.getLampes().size(), "la taille devrait être de 2");
    }

    @Test
    //    activation d'une lampe existante en position 0 ;
    public void activerLampe0(){
        Telecommande t1 = new Telecommande();
        t1.ajouterLampe(new Lampe("lampe1"));
        t1.ajouterLampe(new Lampe("lampe2"));
        t1.activerLampe(0);
        assertEquals(true, t1.getLampes().get(0).isAllume());
    }

    @Test
    //    activation d'une lampe existante en position 1 ;
    public void activerLampe1(){
        Telecommande t1 = new Telecommande();
        t1.ajouterLampe(new Lampe("lampe1"));
        t1.ajouterLampe(new Lampe("lampe2"));
        t1.activerLampe(1);
        assertEquals(true, t1.getLampes().get(1).isAllume());
    }

    @Test
    //    activation d'une lampe inexistante.
    public void activerLampe2(){
        Telecommande t1 = new Telecommande();
        t1.ajouterLampe(new Lampe("lampe1"));
        t1.ajouterLampe(new Lampe("lampe2"));
        t1.activerLampe(3);
        assertEquals(false, t1.getLampes().get(3).isAllume());
    }
}