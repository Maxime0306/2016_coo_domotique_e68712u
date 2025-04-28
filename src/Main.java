
public class Main {

	public static void main(String args[])
	{
		Telecommande t=new Telecommande();
		
		
		Lampe l1=new Lampe("Lampe1");
		t.ajouterPeri(l1);
		
		/****** A COMPLETER ******/
		Hifi h1 = new Hifi();
		t.ajouterPeri(h1);

		Adapter a1 = new Adapter(new  Cheminee());
		t.ajouterPeri(a1);
		
		TelecommandeGraphique tg=new TelecommandeGraphique(t);


		
	}
	
}