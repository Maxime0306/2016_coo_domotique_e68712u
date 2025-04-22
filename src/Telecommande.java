import java.util.ArrayList;

public class Telecommande {
    private ArrayList <Lampe> lampes;
    private ArrayList <Hifi> hifis;

    public Telecommande() {
        this.lampes = new ArrayList <Lampe>();
        this.hifis = new ArrayList<Hifi>();
    }

    public void ajouterLampe(Lampe lampe) {
        this.lampes.add(lampe);
    }

    public void activerLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).allumer();
    }

    public void desactiverLampe(int indiceLampe) {
        this.lampes.get(indiceLampe).eteindre();
    }

    public ArrayList getLampes() {
        return this.lampes;
    }

    public void ajouterHifi(Hifi hifi) {
        this.hifis.add(hifi);
    }

    public void activerHifi(int indiceHifi) {
        this.hifis.get(indiceHifi).allumer();
    }

    public void desactiverHifi(int indiceHifi) {
        this.hifis.get(indiceHifi).eteindre();
    }

    public ArrayList getHifis() {
        return this.hifis;
    }

    public void activerTout() {
        for (Lampe lampe : this.lampes) {
            lampe.allumer();
        }
        for (Hifi hifi : this.hifis) {
            hifi.allumer();
        }
    }

    public String toString() {
        String res = "Telecommande:\n";
        res += "Lampes:\n";
        for (int i = 0; i < this.lampes.size(); i++) {
            res += "Lampe (" + i + ") " + this.lampes.get(i).toString() + "\n";
        }
        return res;
    }
}