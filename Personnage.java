package Application.Personnage;

import Comportements.ComportementArme;

public abstract class Personnage {

	private ComportementArme arme;
	
	protected Personnage(ComportementArme a) {
		this.arme = a;
	}
	
	public void combattre() {
		this.arme.utiliserArme();
	}
		
	public void setArme(ComportementArme a) {
		this.arme = a;
	}
	
}
