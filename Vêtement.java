package projetTutore;

public class Vêtement extends Objet {
	int protection;

	 public Vêtement() {
	 	this.Consommable = false;
	 	this.Nom = Nom;
	 	this.protection = protection;
	 	


	}
	  public int getProtection() {
		return this.protection;
	}
	public void setProtection(int nouvprotection) {
		this.protection = nouvprotection;
	}

//EXTEND -> donc hérite de toute les methodes et attribues inutile de les réécrire ramasser, equipé, desequiper

}

