/*package Application.Personnage;

import Comportements.Implémentation.ComportementEpee;

public class Roi extends Personnage {

	
	public Roi() {
		super(new ComportementEpee());
	}
	
}*/


package Application.Personnage;

import Comportements.Implémentation.ComportementEpee;

public class Roi extends Personnage {

	private static Roi uniqueInstance = new Roi();
	
	private Roi() {
		super(new ComportementEpee());
	}
	
	public static Roi getInstance() {
		
		if (uniqueInstance == null) {
			uniqueInstance = new Roi() ;
		}
		
		return uniqueInstance;

	}
}
