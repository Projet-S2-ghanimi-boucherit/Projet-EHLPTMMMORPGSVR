



public class PJ extends Personnage {
	private boolean Jouable;
    //LA CLASSE HERITE DES ATTRIBUES INUTILE DES LES REECRIRES !!!

    public PJ() {
    	super();
    	this.Jouable = true;
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
 

}
