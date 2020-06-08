
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.ExecutionException;

public class Partie {
	
	private int numPartie;
	private PJ perso;
    private CarteDuJeu carte;
    private Scanner sc;
    private Scanner sc1;
    
    public Partie() {
    	this.numPartie = 0;
    	this.perso = new PJ();
    	this.carte = new CarteDuJeu();
    	
    	this.carte.addTab(0, 0, this.perso);
    	
    	this.carte.afficherCarte();
    	this.perso.affichePerso();
    }
    
    public void ChoixAction() {
    	
    			System.out.println();
    			System.out.println();
    			System.out.println("Veuillez choisir une action parmis, Attaquer : (A), Déplacer : (D), Utiliser un objet : (O), Ramasser : (R).");

    			sc = new Scanner(System.in);
    			String A = sc.nextLine();
    			
    			if (A.equals("A")) {
    				
    				if (this.perso.getPointAction() >= 3 ) {
    				
    					this.attaquer();
    					
    				}
    				else {
    					System.out.println("Vous n'avez pas assez de PA");
    				}
    			}
    			
    			else if (A.equals("D")) {
    				if (this.perso.getPointAction() >= 2) {
    					this.getCarte().seDeplacer(this.getPerso());
    					this.carte.afficherCarte();
    				}
    				else {
    					System.out.println("Vous n'avez pas assez de PA");
    				}
    				
    			}
    			else if (A.equals("O")) {
    				System.out.println("Veuillez saisir l'index de l'objet souhaitez");
    				sc1 = new Scanner(System.in);
        			int i = sc1.nextInt();
        			
    				this.getPerso().useObject(i);
    			}
    			else if (A.equals("R")) {
    				this.Ramasser(this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj());
    				this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].setObj(null) ; 
    				
    				this.carte.afficherCarte();
    				System.out.println();
    				System.out.println();
    				System.out.println();

    				System.out.println("Objet ramassé");
    				
    			}
    			this.getPerso().affichePerso();
    			this.ChoixAction();
    			//}
    	//catch (Exception e) {
    	//System.out.println();
    		//System.out.println();
    		//System.out.print("La saisie ne correspond à aucune action possible");
    		//System.out.println("ou bien l'index de l'objet placer en paramètre ne correspond à aucun objet du sac");
    	//}
    }
    
    
    public void attaquer() {
    	
		if (this.carte.getTabcases()[this.perso.getColonne()+1][this.perso.getLigne()].getObj() instanceof PNJ){
			((Personnage) this.carte.getTabcases()[this.perso.getColonne()+1][this.perso.getLigne()].getObj()).setPointDeVIe(((Personnage) this.carte.getTabcases()[this.perso.getColonne()+1][this.perso.getLigne()].getObj()).getPointDeVie()-this.perso.getArme().getDegats());
			this.perso.setPointAction(this.perso.getPointAction()-3);
			System.out.println("PV du monstre actuellement: "+((Personnage) this.carte.getTabcases()[this.perso.getColonne()+1][this.perso.getLigne()].getObj()).getPointDeVie());
			 if (((Personnage) this.carte.getTabcases()[this.perso.getColonne()+1][this.perso.getLigne()].getObj()).getPointDeVie() == 0){
				 this.carte.getTabcases()[this.perso.getColonne()+1][this.perso.getLigne()].setObj(null);
				 this.carte.afficherCarte();
				 System.out.println();
				 System.out.println("monstre abattu");
				 
			 }
		}
		else if (this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj() instanceof PNJ) {
			((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj()).setPointDeVIe(((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj()).getPointDeVie()-this.perso.getArme().getDegats());
			this.perso.setPointAction(this.perso.getPointAction()-3);
			System.out.println("PV du monstre actuellement: "+((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj()).getPointDeVie());
			if (((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj()).getPointDeVie() == 0){
				 this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].setObj(null);
				 this.carte.afficherCarte();
				 System.out.println();
				 System.out.println("monstre abattu");
	    	
    	}
		
		else if (this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()-1].getObj() instanceof PNJ) {
			((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()-1].getObj()).setPointDeVIe(((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()-1].getObj()).getPointDeVie()-this.perso.getArme().getDegats());
			this.perso.setPointAction(this.perso.getPointAction()-3);
			System.out.println("PV du monstre actuellement: "+((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()-1].getObj()).getPointDeVie());
			if (((Personnage) this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()-1].getObj()).getPointDeVie() == 0){
				 this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()-1].setObj(null);
				 this.carte.afficherCarte();
				 System.out.println();
				 System.out.println("monstre abattu");
	    	
    	}
		else if (this.carte.getTabcases()[this.perso.getColonne()-1][this.perso.getLigne()].getObj() instanceof PNJ ) {
			((Personnage) this.carte.getTabcases()[this.perso.getColonne()-1][this.perso.getLigne()].getObj()).setPointDeVIe(((Personnage) this.carte.getTabcases()[this.perso.getColonne()-1][this.perso.getLigne()].getObj()).getPointDeVie()-this.perso.getArme().getDegats());
			this.perso.setPointAction(this.perso.getPointAction()-3);
			System.out.println("PV du monstre actuellement: "+((Personnage) this.carte.getTabcases()[this.perso.getColonne()-1][this.perso.getLigne()].getObj()).getPointDeVie());
			if (((Personnage) this.carte.getTabcases()[this.perso.getColonne()-1][this.perso.getLigne()].getObj()).getPointDeVie() == 0){
				 this.carte.getTabcases()[this.perso.getColonne()-1][this.perso.getLigne()].setObj(null);
				 this.carte.afficherCarte();
				 System.out.println();
				 System.out.println("monstre abattu");
			}
		
	
	
		else {
		System.out.println("Il n'y a pas de monstre à attaquer, veuillez choisir une autre action");	
	
		}
	  }
	}
  }
}
    
    
    public void Ramasser(Object obj) {
    	if(this.carte.getTabcases()[this.perso.getColonne()][this.perso.getLigne()+1].getObj() instanceof Objet) {
    		this.perso.equiper(obj);
    	}
    	
    	
    }
    
    
    		
    		
    		
    public void Charger() {


		try{
			InputStream flux=new FileInputStream("C://Users//Fareh//Desktop//Sauvegardes.txt"); 
			InputStreamReader lecture=new InputStreamReader(flux);
			BufferedReader buff=new BufferedReader(lecture);
			String ligne;
			while ((ligne=buff.readLine())!=null){
				System.out.println(ligne);
			}
			buff.close(); 
			}		
			catch (Exception e){
			System.out.println(e.toString());
			}
	}
		
	
	
	
	public void sauver() {
    	Writer save = null;

    	try {
    	    save = new BufferedWriter(new OutputStreamWriter(
    	          new FileOutputStream("C://Users//Fareh//Desktop//Sauvegardes.txt"), "utf-8"));
    	    String s=""+this.numPartie+this.perso+this.Afficher2();
    	    save.write(s );
    	    System.out.println("Sauvegardé");
    	} catch (IOException ex) {
    	    // Report
    	} finally {
    	   try {save.close();} catch (Exception ex) {/*ignore*/}
    	}
    }


			

		public static void Creer() {
		   DataOutputStream Nouv = null;
		try {
			Nouv = new DataOutputStream(new FileOutputStream("C://Users//Fareh//Desktop//Sauvegardes.txt"));
			System.out.println("La partie a été créee avec succès !");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
		   try {
			Nouv.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}		  	   
			}
		   
	   	}

		public int getNumPartie() {
			return numPartie;
		}

		public PJ getPerso() {
			return perso;
		}

		public void setPerso(PJ perso) {
			this.perso = perso;
		}

		public void setNumPartie(int numPartie) {
			this.numPartie = numPartie;
		}
		
		public CarteDuJeu getCarte() {
			return this.carte;
		}
		
		public String toString() {
			String newline=System.getProperty("line.separator");
			String s = newline + newline + "partie N°" + this.numPartie + newline + "Info personnage :" + this.perso + newline +  newline + newline;
			return s;
		}

		  public String Afficher2() {
			    
		    	return Arrays.toString(this.carte.getTabcases()); 
		    }
		  
		  public Scanner getScanner() {
			  return this.sc;
		  }


}
	
	
	
	
	
	
	
	
	

   
   


