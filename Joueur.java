
import java.util.ArrayList;

public class Joueur {
    private String nom;
    private ArrayList<Partie> listePartie;
    
    public Joueur() {
    	this.nom = "J-X";
    	this.setListePartie(new ArrayList<Partie>());
    }
    
    public Joueur(String Nom) {
    	this.nom = Nom;
    	this.listePartie = new ArrayList<Partie>();
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String Value) {
    	this.nom=Value;
    }
    public ArrayList<Partie> getListePartie() {
		return listePartie;
	}

	public void setListePartie(ArrayList<Partie> listePartie) {
		this.listePartie = listePartie;
	}

	public String toString() {
    	
    	String s = "Pseudo: " + this.nom ;
    	return s;
    }

	public void add(Partie p) {
		this.listePartie.add(p);
	}

}
