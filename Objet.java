package projetTutore;
import java.util.ArrayList;
public class  Objet {

private boolean Consommmable;
private String Nom;
private Personnage perso; 
public ArrayList<Objet> SacObjet;
    
    public Objet(String nom){
    	this.Nom = nom;
    	this.Consommmable= false;
    	//PAR DEFAUT CE SERA NULL
    	//Met tout les this à part personnage
    }
    
  public void Ramasser(){
    	//là pour l'instant je vois pas quoi faire 
    	//donc ce sera pour la v2
	  

  	}
  	public void Jeter(int position) {
  		SacObjet.remove(position);
  		
  		
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
   


} 

