
public class  Objet {

    String Nom;
    Personnage perso;    
    
    public Objet(String Nom){
    	this.Nom = Nom;
    	//PAR DEFAUT CE SERA NULL
    	//Met tout les this à part personnage
    	}


    public void Ramasser(){
    	//là pour l'instant je vois pas quoi faire 
    	//donc ce sera pour la v2

    }


	public String toString(){
		return Nom;

    }
	
    public String getNom() {
		return Nom;
	}
    public void setNom(String nom) {
		Nom = nom;
	}
    public Personnage getPerso() {
		return perso;
	}
    public void setPerso(Personnage perso) {
		this.perso = perso;
	}


	public void soin() {
		// TODO Auto-generated method stub
		
	}

} 