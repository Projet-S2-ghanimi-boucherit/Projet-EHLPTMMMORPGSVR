package projetTutore;
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
	public String Nom;
	public Cases cases;
	 public Cases[][] Tabcases;

    public Personnage personnage;
    public int numPartie;
    public CarteDuJeu carte;
    public Partie game;

    public Partie(int UnNumPartie, Personnage unPersonnage, CarteDuJeu uneCarte) {
    	this.numPartie  = numPartie;
    	this.personnage = unPersonnage;
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
	
	
	
	

		public void main(String[] args){
		Sauvegarder();
		 Charger();
		}
	
	
	
	}
	
	
	
	
	
	
	
	
	

   
   


