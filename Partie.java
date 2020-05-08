
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Partie {
	public String Nom;

    public Personnage personnage;
    public int numPartie;
    public CarteDuJeu carte;

    public Partie(int UnNumPartie, Personnage unPersonnage, CarteDuJeu uneCarte) {
    	this.numPartie  = UnNumPartie;
    	this.personnage = unPersonnage;
    	this.carte = uneCarte;
    }
	
	public static void Charger() {
		
		// initialisation de la variable qui va nous permettre de lire
	    FileInputStream Lecture = null;

	    try {
	      // Ouvre un flux pointant sur le fichier
	              Lecture = new FileInputStream("C://Users//Fareh//Desktop//Sauvegardes.txt");

		while (true) {
		  int valeurEntièreOctet = Lecture.read();
		  System.out.print(" " + valeurEntièreOctet);
			   
		  if (valeurEntièreOctet  == -1) {
	          // On a atteint la fin du fichier
		    // On sort de la boucle
		    break;
	        }  
		} // Fin de la boucle while
	      // Lecture.close(); pas à cet endroit
	    } catch (IOException exception) {
		System.out.println("Impossible de lire le fichier : " + exception.toString());} 
	 finally {
	 	
	    	try {
	 		// On met Lecture.close ici pour pouvoir fermer le flux même en cas d'erreur
		  Lecture.close();
		} catch (Exception exception1){
		  exception1.printStackTrace() ;
		}
		System.out.println("Lecture du fichier terminée.");	           
	    
	    }
	
	
	}
	
		public static void Sauvegarder() {
		
		      int données[] = {56, 230, 123, 43, 11, 37};
			  FileOutputStream monFichier = null;
			  BufferedOutputStream tampon = null;

			  try {
			    monFichier = new FileOutputStream("C://Users//Fareh//Desktop//Sauvegardes.txt");
			    // Connecte les flux
			    tampon = new BufferedOutputStream(monFichier);
			    for (int i = 0; i < données.length; i++) {
				tampon.write(données[i]);
				System.out.println("Partie sauvegardée");
			    }
			  } catch (IOException exception) { 
			    exception.printStackTrace();
			  } finally {  
			    try {
				tampon.flush();
				tampon.close();
				monFichier.close();
			    } catch (IOException exception1) {
				exception1.printStackTrace();
			    	
			  
			    }
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
	
	
	
		public static void main(String[] args){
		Sauvegarder();
		 Charger();
		}
	
	
	
	}
	
	
	
	
	
	
	
	
	

   
   


