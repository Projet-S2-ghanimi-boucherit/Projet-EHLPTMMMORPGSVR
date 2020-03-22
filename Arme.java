package projetTutore;

public class Arme extends Objet {
	private int Degats;
	public Arme() {
		this.Consommable = false;
		this.Nom=Nom;
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



