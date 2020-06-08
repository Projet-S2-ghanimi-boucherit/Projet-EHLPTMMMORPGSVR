

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Personnage {
    private int PointAction;
    private Arme arme;
    
    private int Force;
    private int Adresse;
    private int Endurance;
    
    private int Initiative;
    private int Attaque;
    private int Defense;
    
    protected int PointDeVie;
    private int Xp;
    private ArrayList<Object> SacObjet;
    
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
    	
    	Arme Epée = new Arme("Epée",5);
    	
    	this.arme = Epée;
    	
    	Objet soin= new Potion("soin1", "soin");
    	
    	this.PointAction = 10;
    	this.Initiative = 0;
    	this.Attaque = 0;
    	this.Defense = 0;
    	
    	this.Xp = 0;
    	this.PointDeVie = 93;
    	
    	SacObjet = new ArrayList<Object>();
    	SacObjet.add(this.arme);
    	SacObjet.add(soin);
    }
    
    public int randNum(int min, int max) {
    	int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
    	return randomNum;
    }

    
    // METHODES //
    
    public void equiper(Object obj){
    	this.SacObjet.add(obj);
    	
    }
    
   
    		

    public void soin() {
    	if (this.getPointDeVie() >= 95 && this.getPointDeVie() <= 99) {
    		int dif = 100 - this.getPointDeVie();
    		int val = dif + this.getPointDeVie();
    		System.out.println("Restauration de "+ dif + " PV");
    		this.setPointDeVIe(val);
    	}
    	else {
    		int val = this.getPointDeVie() + 5;
    		System.out.println("Restauration de 5 PV");
    		this.setPointDeVIe(val);
    	}
    }

    public void molotov() {
        int val = this.getPointDeVie()-6;
    			  this.setPointDeVIe(val); 
    	
    }
    

    
    public void useObject(int i) {
    	
    	if (this.SacObjet.contains(this.SacObjet.get(i))) {
    		int PV = getPointDeVie();
    		
    		if (PV < 100) {
    			this.soin();
    		}
    		else {
    			System.out.println("Vos points de vie sont au maximum");
    		}
    		
    	}
  
    	else {
    		
    		if(getPointDeVie() <= 6) {
    			this.molotov();
    			System.out.println("Vous n'avez plus de point de vie");
    		}
    		else {
    			this.molotov();
    		}
    	}
    	
    	this.SacObjet.remove(this.SacObjet.get(i));
    
    }
    
    public void affichePerso() {
    	
    	String newline=System.getProperty("line.separator");
    	String s;
    	s = newline + "Vos points d'action: " + this.PointAction + newline + "Vos caractéristiques :" + newline + "- Force: " + this.Force + newline +"- Adresse : " + this.Adresse + newline +"- Endurance: " + this.Endurance + newline +"+ Initiative: " + this.Initiative + newline +"+ Attaque: " + this.Attaque + newline +"+ Defence: " + this.Defense + newline + newline +"Vos objets équipés : " + this.SacObjet ;
    	System.out.println();
		System.out.println();
    	System.out.println(s);
    	this.AfficherPointDeVie();
    	
    	
    }

    public void convertPosition(String position, Hashtable<Integer, String> d) {
    	
    	final String decoupeur = "-";
    	
        String mots[] = position.split(decoupeur);
        String colonne = mots[1];
        
        int nouvColonne = Integer.parseInt(colonne);
        
        int nouvLigne = 0;

        for(Map.Entry entry: d.entrySet()){
        	
            if(mots[0].equals(entry.getValue())){
            	
                nouvLigne = (int) entry.getKey();
                break; //breaking because its one to one map
            }
        }
        
        this.setLigne(nouvLigne);
        this.setColonne(nouvColonne);
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
    
    public int getLigne() {
    	return this.ligne;
    }
    
    public int getColonne() {
    	return this.colonne;
    }
    
    public ArrayList<Object> getSacObjet () {
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
	
    public void setPointDeVIe(int value) {
		this.PointDeVie = value;
		
	}
    public int getPointDeVie() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.PointDeVie;
    }

    int getXp() {
        // Automatically generated method. Please delete this comment before entering specific code.
        return this.Xp;
    }

    void setXp(int value) {
        // Automatically generated method. Please delete this comment before entering specific code.
        this.Xp = value;
    }
    
	public void setArme(Arme nouvArme) {
		this.arme = nouvArme;
	}
	
	public Arme getArme() {
		return this.arme;
	}
		
}
    
