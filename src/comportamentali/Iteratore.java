package comportamentali;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;





public class Iteratore {
	private List<?> Contatti; // creo una lista di tipo generico
	public Iteratore() {
		this.Contatti=new ArrayList <?> ();	 // creo un array di tipo BEN deFINITO e non generico
		Iterator<E> <?> it = this.Contatti.iterator(); // creo un iteratore it di tipo generico che punta all'iterator dell'array list.
		it.hasNext(); // verifico che iterator abbiamo un valore successivo
		it.next()// scorro l'iterator
		
		
	}
	
	
}
