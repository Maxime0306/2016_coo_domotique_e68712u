import java.util.ArrayList;

public class Telecommande {

    private ArrayList<Lampe> lampes;

    public Telecommande() {
        this.lampes = new ArrayList<Lampe>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void activerLampe(int index) {
        this.lampes.get(index).allumer();
    }

    public void desactiverLampe(int index) {
        this.lampes.get(index).eteindre();
    }

    public void activerTout() {
        throw new Error ( " code non ecrit " );
    }

    public String toString(){
        throw new Error ( " code non ecrit " );
    }

    public ArrayList<Lampe> getLampes() {
        return this.lampes;
    }
}