public class AdapterCheminee  implements Peripherique{

    private Cheminee cheminee;

    public AdapterCheminee(Cheminee cheminee) {
        this.cheminee = cheminee;
    }

    public void allumer() {
        this.cheminee.changerIntensite(10);
    }

    public void eteindre() {
        this.cheminee.changerIntensite(0);
    }

    public int getIntensite() {
        return this.cheminee.getLumiere();
    }

    public String toString() {
        return this.cheminee.toString();
    }
}
