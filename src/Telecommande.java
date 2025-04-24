import java.util.ArrayList;

public class Telecommande {
    private ArrayList <Peripherique> peripherique;

    public Telecommande() {
        this.peripherique = new ArrayList <Peripherique>();
    }

    public void ajouterPeri(Peripherique p) {
        this.peripherique.add(p);
    }

    public void activerTout() {
        for (Peripherique peripherique : this.peripherique) {
            peripherique.allumer();
        }
    }

    public String toString() {
        String res = "Telecommande:\n";
        res += "Peripherique:\n";
        for (int i = 0; i < this.peripherique.size(); i++) {
            res += "Peripherique (" + i + ") " + this.peripherique.get(i).toString() + "\n";
        }
        return res;
    }
}