
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
    	
    	
   
    	 // java doc de l'arraylist : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
    	// dans la classe personnage il y a comme attribut:
    	// public ArrayList<Objet> ListObjet;
    	//Regarde la classe TestObjet pour que tu sache quoi faire

	public void Desequiper(Objet obj){
        this.remove(obj);
    	//Tu retire l'objet dans l'arrayList du personnage
    	// java doc de l'arraylist : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

    }

    private void remove(Objet obj) {
		// TODO Auto-generated method stub
		
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