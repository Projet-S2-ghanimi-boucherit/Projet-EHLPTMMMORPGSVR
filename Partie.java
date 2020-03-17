import com.modeliosoft.modelio.javadesigner.annotations.objid;


public class Partie {
    @objid ("5474aa0d-0fe0-46f1-ac69-9921e1441343")
    public String Nom;

    public Personnage personnage;
    public String numPartie;
    
    public Partie(int UnNumPartie, Personnage unPersonnage) {
    	this.numPartie  = UnNumPartie;
    	this.personnage = unPersonnage;
    	}

    public void Sauvegarder() {
    }


    public void Charger() {
    }


    public void Creer() {
    }


    public void Supprimer() {
    }
    
    public String getNom() {
        return this.Nom;
    }


    public void setNom(String value) {
        this.Nom = value;
    }

}
