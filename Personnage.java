//https://www-info.iutv.univ-paris13.fr/dokuwiki/doku.php?id=m2107:start
import java.util.ArrayList;
import java.util.Scanner;
import java.util.*;
import java.util.concurrent.ThreadLocalRandom;

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
    private ArrayList<Objet> SacObjet;
    
    private int ligne;
    private int colonne;
    
    

    public Personnage() {
    	
    	int degreTotal = 0;
    	
    	while (degreTotal != 18 ) {
    		this.Force = randNum(0,6);
    		this.Adresse = randNum(0,6);
    		this.Endurance = randNum(0,6);
    		degreTotal = this.Force + this.Adresse + this.Endurance;
    	}
    	
    	this.PointAction = 10;
    	this.Initiative = 0;
    	this.Attaque = 0;
    	this.Defense = 0;
    	
    	this.Xp = 0;
    	this.PointDeVie = 100;
    	
    	SacObjet = new ArrayList<Objet>();
    	
    }
    
    public int randNum(int min, int max) {
    	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    	return randomNum;
    }

    
    // METHODES //
    
    public void equiper(Objet obj){
    	this.SacObjet.add(obj);
    	
    }
    
    public void soin() {
    	int val = this.getPointDeVIe()+5;
    			  this.setPointDeVIe(val);
    }

    public void molotov() {
        int val = this.getPointDeVIe()-6;
    			  this.setPointDeVIe(val); 
    	
    }
    

    public boolean seDeplacer() {
    	
    	if (getPointAction() >= 2) {
    	    System.out.println("Saisissez la case où vous voulez vous déplacer (Exemple: B-5)");
    	    
    	    Scanner sc1 = new Scanner(System.in);
    	    String position = sc1.nextLine();
    	    sc1.close();
    	    convertPosition(position);
    	    
    	    //addTab(this.ligne, this.colonne, this);
    	        		
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
    	if (this.SacObjet.contains(o) && o.getType() == "soin") {
    		this.soin();
    	}
    	
    	else {
    		this.molotov();
    	}
    	
    	this.SacObjet.remove(o);
    }
    

    private boolean contains(Objet o) {
		// TODO Auto-generated method stub
		return false;
	}


	public void ChoixAction() {
    	System.out.println("Veuillez choisir une action parmis, Attaquer : (A), Déplacer : (B), Utiliser un objet : (C).");

    			Scanner sc = new Scanner(System.in);
    			String A = sc.nextLine();
    			sc.close();
    			
    			A = "d";
    }
    
    public void affichePerso() {
    	String newline=System.getProperty("line.separator");
    	String s;
    	s = newline + "Vos caractéristiques :" + newline + "- Force: " + this.Force + newline +"- Adresse : " + this.Adresse + newline +"- Endurance: " + this.Endurance + newline +"+ Initiative: " + this.Initiative + newline +"+ Attaque: " + this.Attaque + newline +"+ Defence: " + this.Defense + newline + newline +"Vos objets équipés : " + this.SacObjet ;
    	System.out.println(s);
    	this.AfficherPointDeVie();
    	
    }

    
    public boolean isAlpha(String name) {
        return name.matches("[a-zA-Z]+");
    }
    
    public void convertPosition(String position) {
    	
    	final String decoupeur = "-";
        String mots[] = position.split(decoupeur);
        
        String ligne = mots[1];
        int nouvLigne = Integer.parseInt(ligne);
        int nouvColonne = 1;
        
        setLigne(nouvLigne);
        setColonne(nouvColonne);
    }
    

    public void AfficherPointDeVie() {
    	
    	if ( this.PointDeVie == 0 ) {
    		
    		String newline=System.getProperty("line.separator");
    		String s = new String ( "Points de vie :" + this.PointDeVie + newline +"Vous êtes mort..." + newline + "Fin de la partie");
    		System.out.println(s);
    	}
    	else if ( this.PointDeVie >=79 ) {
    		
    		String newline=System.getProperty("line.separator");
    		String s = new String ("Points de vie :" + this.PointDeVie + newline +"Votre niveau de blessure est nulle ou quasi nulle");
    		System.out.println(s);
    	}
    	
    	else if (this.PointDeVie >=59) {
    		String newline=System.getProperty("line.separator");
    		String s = new String ("Points de vie :" + this.PointDeVie + newline +"Votre niveau de blessure est superficielle");
    		System.out.println(s);
    	}
    	
    	else if (this.PointDeVie >=39) {
    		String newline=System.getProperty("line.separator");
    		String s = new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes légèrment blessé");
    		System.out.println(s);
    	}
    	
    	else if (this.PointDeVie >=19) {
    		String newline=System.getProperty("line.separator");
    		String s =  new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes gravement blessé");
    		System.out.println(s);
    	}
    	
    	else {
    		String newline=System.getProperty("line.separator");
    		String s = new String ("Points de vie :" + this.PointDeVie + newline +"Vous êtes actuellement inconscient et ne pouvez réaliser aucune action à moins d'être soigné");
    		System.out.println(s);
    	}
    }
    
    public String toString() {
    	String newline=System.getProperty("line.separator");
    	String s;
    	s = newline + "Vos caractéristiques :" + newline + "- Force: " + this.Force + newline +"- Adresse : " + this.Adresse + newline +"- Endurance: " + this.Endurance + newline +"+ Initiative: " + this.Initiative + newline +"+ Attaque: " + this.Attaque + newline +"+ Defence: " + this.Defense + newline + newline +"Point de vie: " + this.PointDeVie + ", Point d'action: " + this.PointAction + ", Point d'experience(XP): " + this.Xp + newline +"Vos objets équipés : " + this.SacObjet ;
    	return s;
    }
    
    
    
    // GETTER ET SETTER //
    
    public void setLigne(int val) {
    	this.ligne = val;
    }
    
    public void setColonne(int val) {
    	this.colonne = val;
    }
    
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