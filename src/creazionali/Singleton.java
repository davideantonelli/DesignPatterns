package creazionali;
/**
 * Il singleton è un design pattern di tipo creazionale. La sua funzione è quella di garantire, all' interno di un ambiente software, un' unica istanza di una determinata classe.
*In java il meccanismo di implementazione per permettere questo tipo di comportamento è molto semplice. Infatti basta rendere il costruttore della classe con il modificatore di accesso private e delegare la creazione dell'istanza ad un metodo di tipo statico:

 * @author Davide
 *
 */


public class Singleton {
	/**
	 * Riferimento all'istanza
	 */
	private static Singleton istance=null;
	/**
	 * Costruttore di tipo private
	 */
	private  Singleton() {
		
	}
	/**
	 *  Crea l'istanza, non modificabile(static) della classe singleton
	 * @return istance 
	 * Ritorna l'istanza appena creata
	 */
	public static Singleton GetIstance() {
		if (istance == null) {
			istance= new Singleton();
			
		}
		return istance;
		
	}
	
	/**
	 * E' il metodo che esegue qualcosa
	 */
	public void metodo() {
		
	}
	
	/**
	 *{@codeSingleton sg1 = Singleton.getIstance(); // Crea l' stanza
sg1.metodo();
Singleton sg2 = Singleton.getIstance(); // Ritorna il riferimento
sg2.metodo();
sg1 e sg2 puntano allo stesso oggetto}
	 */
	

}
