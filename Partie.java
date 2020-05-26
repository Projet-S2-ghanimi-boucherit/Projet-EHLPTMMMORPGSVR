
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

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


		    //lecture
		    ArrayList<String> arraylist= new ArrayList<String>();
		    try {
		      FileInputStream fileIn = new FileInputStream("C://Users//Fareh//Desktop//Sauvegardes.txt");
		      ObjectInputStream ois = new ObjectInputStream(fileIn);
		      arraylist = (ArrayList) ois.readObject();
		      ois.close();
		      fileIn.close();
		    } catch (FileNotFoundException e) {
		      e.printStackTrace();
		    } catch (IOException e) {
		      e.printStackTrace();
		    } catch (ClassNotFoundException e) {
		      // TODO Auto-generated catch block
		       e.printStackTrace();
		    }

		    System.out.println("Lire les données: \n");
		    for(String o:arraylist)
		      System.out.println(o);
		  }
		
	
	
	
		public  void Sauvegarder() {
		
			  try {
			       FileOutputStream fileOut = new FileOutputStream("C://Users//Fareh//Desktop//Sauvegardes.txt");
			       ObjectOutputStream out = new ObjectOutputStream(fileOut);
			       out.writeObject(this.carte);
			       out.close();
			       fileOut.close();
			       System.out.println("\nSerialisation terminée avec succès...\n");
			 
			     } catch (FileNotFoundException e) {
			       e.printStackTrace();
			     } catch (IOException e) {
			       e.printStackTrace();
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
}
	
	
	
	
	
	
	
	
	

   
   


