package projetTutore;

public class Potion extends Objet {
	

	public Potion() {
		this.Consommable = true;
		this.Nom = Nom;
		
		

		//Ajoute les autre attribue en dessous (nom)
    }

    public void Soin() {
    	int val=this.getPointDeVIe()+5;
    	this.setPointDeVIe(val);
    	//soigne de X point de vie (voir le sujet du projet)
    	// Donc dabord int val = getPointDeVie() + X point
    	//puis appelle la methode setPointDeVIe(int value) sur un personnage
    	//Tu fera sur le TestObjet pj.soin();
    }

    public void Molotov() {
        int val=this.getPointDeVIe()-6;
    	this.setPointDeVIe(val);
    	//enleve de X point de vie (voir le sujet du projet)
    	// Donc dabord int val = getPointDeVie() - X point
    	//puis appelle la methode setPointDeVIe(int value) sur un personnage
    	//Tu fera sur le TestObjet pj.molotov();
    }
    

//EXTEND -> donc hérite de toute les methodes et attribues inutile de les réécrire ramasser, equipé, desequiper

}
