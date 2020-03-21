import com.modeliosoft.modelio.javadesigner.annotations.objid;

//EXTEND -> donc hérite de toute les methodes et attribues inutile de les réécrire ici

public class Potion extends Objet {


	public Potion() {
		this.Consommable = true;

		//Ajoute les autre attribue en dessous (nom)
    }

    public void Soin() {
    	//soigne de X point de vie (voir le sujet du projet)
    	// Donc dabord int val = getPointDeVie() + X point
    	//puis appelle la methode setPointDeVIe(int value) sur un personnage
    	//Tu fera sur le TestObjet pj.soin();
    }

    public void Molotov() {
    	//enleve de X point de vie (voir le sujet du projet)
    	// Donc dabord int val = getPointDeVie() - X point
    	//puis appelle la methode setPointDeVIe(int value) sur un personnage
    	//Tu fera sur le TestObjet pj.molotov();
    }

//EXTEND -> donc hérite de toute les methodes et attribues inutile de les réécrire ramasser, equipé, desequiper

}
