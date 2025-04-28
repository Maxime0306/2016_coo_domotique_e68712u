public class Adapter  implements Peripherique{

    private Cheminee cheminee;

    public Adapter(Cheminee cheminee) {
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
}
