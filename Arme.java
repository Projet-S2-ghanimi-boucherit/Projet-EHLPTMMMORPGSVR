package projetTutore;


public class Arme extends Objet {
	private int Degats;
	private boolean Consommable;
	
	public Arme (String nom, int Degats) {
		super(nom, nom);
		this.Consommable = false;
		this.Degats=Degats;

	 	//Ajoute les autre attribue en dessous nom,dégats
		
    }
	public int getDegats() {
		return this.Degats;
	}
	public void setDegats(int nouvdegat) {
		this.Degats = nouvdegat;
	}
	
//EXTEND -> donc hérite de toute les methodes et attribues inutile de les réécrire ramasser, equipé, desequiper
	
}


