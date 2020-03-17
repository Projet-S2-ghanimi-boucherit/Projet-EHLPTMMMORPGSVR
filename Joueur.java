import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class Joueur {
    public String Nom;
    public ArrayList<Partie> listePartie;
    
    public Joueur() {
    	this.Nom = Nom;
    	listePartie = new ArrayList<Partie>();
    }

    String getNom() {
        return this.Nom;
    }

    void setNom(String value) {
        this.Nom = value;
    }

    
    public String toString() {
    	
    	String s = 'Pseudo: ' + this.Nom + ', Liste des parties :';
    	return s;
    }

}
