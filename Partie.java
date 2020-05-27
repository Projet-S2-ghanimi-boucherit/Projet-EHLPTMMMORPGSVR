package projetTutore;


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

public class Partie {
	
	private int numPartie;
	private Personnage perso;
    private CarteDuJeu carte;
    
    public Partie() {
    	this.numPartie = 0;
    	this.perso = new PJ();
    	this.carte = new CarteDuJeu();
    	
    	this.carte.addTab(0, 0, this.perso);
    }
    
    public Partie(int unNumPartie, Personnage unPersonnage, CarteDuJeu uneCarte) {
    	this.numPartie = unNumPartie;
    	this.perso = unPersonnage;
    	this.carte = uneCarte;
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

		public Personnage getPerso() {
			return perso;
		}

		public void setPerso(Personnage perso) {
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


}
	
	
	
	
	
	
	
	
	

   
   


