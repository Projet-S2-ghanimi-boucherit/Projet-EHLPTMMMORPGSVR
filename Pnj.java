package projetTutore;

public class Pnj extends Personnage {
    private boolean Jouable;
    //LA CLASSE HERITE DES ATTRIBUES INUTILE DES LES REECRIRES !!!

    public Pnj() {
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

 } 