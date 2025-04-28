import thermos.Thermostat;

public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterPeri(l1);
		
		/****** A COMPLETER ******/
		Hifi h1 = new Hifi();
		t.ajouterPeri(h1);

		AdapterCheminee c1 = new AdapterCheminee(new  Cheminee());
		t.ajouterPeri(c1);

		AdapterThermostat t1 = new AdapterThermostat(new Thermostat());
		t.ajouterPeri(t1);
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);

		
	}
	
}