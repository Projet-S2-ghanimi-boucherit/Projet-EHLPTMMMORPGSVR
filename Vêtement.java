package projetTutore;

public class V�tement extends Objet {
	int protection;

	 public V�tement() {
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

//EXTEND -> donc h�rite de toute les methodes et attribues inutile de les r��crire ramasser, equip�, desequiper

}

