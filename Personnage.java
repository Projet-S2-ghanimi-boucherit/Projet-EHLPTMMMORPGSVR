import java.util.ArrayList;
import java.util.*;

public class Personnage {
 
    private int PointAction;
    
    private int Force;
    private int Adresse;
    private int Endurance;
    
    private int Initiative;
    private int Attaque;
    private int Defense;
    
    private int PointDeVie;
    private int Xp;
    public ArrayList<Objet> SacObjet;

    public Personnage() {
    	System.out.println("Répartissez 18 degrés entre les trois caractéristiques dans cette ordre: Force, Adresse, Endurance");
    	
    	Scanner sc = new Scanner(System.in);
    	
    	int force = sc.nextInt();
    	this.Force = force;
    	
    	int adresse = sc.nextInt();
    	this.Adresse = adresse;
    	
    	int endurance = sc.nextInt();
    	this.Endurance = endurance;
    	
    	sc.close();
    	
    	this.PointAction = 10;
    	this.Initiative = 0;
    	this.Attaque = 0;
    	this.Defense = 0;
    	
    	this.Xp = 0;
    	this.PointDeVie = 100;
    	
    	SacObjet = new ArrayList<Objet>();
    	
    }

    
    // METHODES //
    
    public void Equiper(Objet obj){
    	this.SacObjet.add(obj);
    }
    
    // DEBUT CODE LUNDI 6 AVRIL

    public boolean seDeplacer() {
    	
    	if (getPointAction() >= 2) {
    		
    		Scanner sc = new Scanner(System.in);
    	    System.out.println("Saisissez la case où vous voulez vous déplacer : ");
    	    
    	    int position = sc.nextInt();
    	    sc.close();
    	        		
    		int PA = getPointAction();
    		int nouvPA = PA - 2;
    		setPointAction(nouvPA);
    		
    		return true;
    	}
    	
    	else {
    		System.out.println("Vous n'avez pas assez de Point d'Action, veuiller choisir une autre action ou attendre d'avoir assez de point");
    		return false;
    	}
    }
    
    
    public boolean attaquer() {
    	if (getPointAction() >= 3) {
    		
    		return true;
    	}
    	
    	else {
    		System.out.println("Vous n'avez pas assez de Point d'Action, veuiller choisir une autre action ou attendre d'avoir assez de point");
    		return false;
    	}
    }
    
    public void useObject(Objet o) {
    }
    

    public void ChoixAction() {
    	System.out.println("Veuillez choisir une action parmis, Attaquer : (A), Déplacer : (B), Utiliser un objet : (C).");

    			Scanner sc = new Scanner(System.in);
    			String A = sc.nextLine();
    			sc.close();
    			
    			A = "d";
    }

    
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }

    public String AfficherPointDeVie() {
    	
    	if ( this.PointDeVie == 0 ) {
    		
    		String newline=System.getProperty("line.separator");
    		return new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes mort..." + newline + "Fin de la partie");
    	}
    	else if ( this.PointDeVie >=79 ) {
    		
    		String newline=System.getProperty("line.separator");
    		return new String ("Points de vie :" + this.PointDeVie + newline +"Votre niveau de blessure est nulle ou quasi nulle");
    	}
    	
    	else if (this.PointDeVie >=59) {
    		String newline=System.getProperty("line.separator");
    		return new String ("Points de vie :" + this.PointDeVie + newline +"Votre niveau de blessure est superficielle");
    	}
    	
    	else if (this.PointDeVie >=39) {
    		String newline=System.getProperty("line.separator");
    		return new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes légèrment blessé");
    	}
    	
    	else if (this.PointDeVie >=19) {
    		String newline=System.getProperty("line.separator");
    		return new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes gravement blessé");
    	}
    	
    	else {
    		String newline=System.getProperty("line.separator");
    		return new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes actuellement inconscient et ne pouvez réaliser aucune action à moins d'être soigné");
    	}
    }
    
    // FIN CODE LUNDI 6 AVRIL
    
    public String toString() {
    	String newline=System.getProperty("line.separator");
    	String s;
    	s = "Force: " + this.Force + ", Adresse : " + this.Adresse + ", Endurance: " + this.Endurance + newline +"Initiative: " + this.Initiative + ", Attaque: " + this.Attaque + ", Defence: " + this.Defense + newline +"Point de vie: " + this.PointDeVie + ", Point d'action: " + this.PointAction + " Point d'experience(XP): " + this.Xp + newline +"Sac: " + this.SacObjet ;
    	return s;
    }
    
    
    
    // GETTER ET SETTER //
    
    public ArrayList<Objet> getSacObjet () {
    	return this.SacObjet;
    }

    int getPointAction() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PointAction;
    }

    void setPointAction(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PointAction = value;
    }

    int getAdresse() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Adresse;
    }

    void setAdresse(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Adresse = value;
    }

    int getInitiative() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Initiative;
    }

    void setInitiative(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Initiative = value;
    }

    public int getForce() {
		return Force;
	}


	public void setForce(int force) {
		Force = force;
	}


	int getAttaque() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Attaque;
    }

    void setAttaque(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Attaque = value;
    }

    int getDefense() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Defense;
    }

    void setDefense(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Defense = value;
    }

    int getEndurance() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Endurance;
    }

    void setEndurance(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Endurance = value;
    }

    int getPointDeVIe() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PointDeVie;
    }

    void setPointDeVIe(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.PointDeVie = value;
    }


    int getXp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Xp;
    }

    void setXp(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Xp = value;
    }

}