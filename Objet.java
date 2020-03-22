package projetTutore;
import java.util.ArrayList;

 
public class  Objet {

    String Nom;
    Personnage perso;
    Boolean Consommable;
    
    
    

    public Objet(){
    	this.Consommable = null;
    	this.Nom = Nom;
    	//PAR DEFAUT CE SERA NULL
    	//Met tout les this à part personnage
    	}


    public void Ramasser(){
    	//là pour l'instant je vois pas quoi faire 
    	//donc ce sera pour la v2

    }

    public void Equiper(Objet obj){
    	this.add(obj);
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

    public String toString(){
		return Nom;

    }
    public Boolean getConsommable() {
		return Consommable;
	}
    public void setConsommable(Boolean consommable) {
		Consommable = consommable;
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

} 

