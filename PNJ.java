package projetTutore;


public class PNJ extends Personnage {
    private boolean Jouable;

    public PNJ() {
    	super();
    	this.Jouable = false;
    }

    public String toString(){
    	String s;
    	s = "Jouable: " + this.Jouable + super.toString();
		return s;

    }

    // GETTER ET SETTER //
    void setJouable(boolean value) {
        this.Jouable = value;
    }

    boolean getJouable() {
        return this.Jouable;
    }

	public void setPointDeVIe(int value) {
		this.PointDeVie = value;
		
	}


    
 }