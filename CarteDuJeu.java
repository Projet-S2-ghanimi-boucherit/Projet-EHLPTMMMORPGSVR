package projetTutore;


import java.util.Scanner;
import java.util.Arrays;
import java.util.Hashtable;

public class CarteDuJeu {
    
    private Cases[][] Tabcases;
    private String[] AlphColonne = { "A", "B", "C", "D", "E", "F"};
    private int[] NumLigne;
    private int n = 30;
    private Hashtable<Integer, String> dico;

    public CarteDuJeu() {
    	 this.Tabcases = new Cases[n][6];
    	 
    	 
    	 for (int i = 0; i < Tabcases.length; i++) {
    		 
    		 for (int j = 0;j < Tabcases[i].length;j++) {
                 this.Tabcases[i][j] = new Cases(i, j, null);
              }
    	 }
    	 
    	 
    	 this.NumLigne = new int[n];
    	 for (int i = 0 ; i <= n-1; i++) {
    		 this.NumLigne[i] = i;
    	 }
    
    	 this.dico = new Hashtable<Integer, String>(6);
    	 for (int i = 0 ; i < AlphColonne.length; i++) {
    		 dico.put(new Integer(i),AlphColonne[i]);
    	 }
    	 
    	 
    	Personnage Monstre1 = new PNJ();
    	this.addTab(5, 4, Monstre1);
    	
    	Personnage Monstre2 = new PNJ();
    	this.addTab(1, 10, Monstre2);
    	
    	Potion p1= new Potion("superpotion","soin");
    	this.addTab(1,0,p1);
    	
    }
    
    public void addTab (int ligne, int colonne, Object nouvObj){
    	this.Tabcases[colonne][ligne].setObj(nouvObj);
   
    }
    
 
    public void afficherCarte() {
    	System.out.println("     ####################################################");
    	
    	for (int i = 0; i < Tabcases.length; i++) {
    		
    		System.out.print ("   ");
    		System.out.print(this.NumLigne[i] + " #");
    		
             for (int j = 0;j < Tabcases[i].length;j++) {
            	 
            	 if (this.Tabcases[i][j].getObj() instanceof PJ) {
            		 System.out.print("    P   ");
            	 }
            	 else if (this.Tabcases[i][j].getObj() instanceof PNJ){
            		 System.out.print("    M   ");
            	 }
            	 else if( this.Tabcases[i][j].getObj() instanceof Potion) {
            		 System.out.print("    S   ");
            		 
            		 
            	 }
            		 
            	 
            	 else {
            		 System.out.print("        ");
            	 }
             }
             System.out.print(" ");
             System.out.println(" #");
          }
    	System.out.println("      ####################################################");
    	
    	
    	for (int i = 0; i < AlphColonne.length; i++) {
    		System.out.print("	" + AlphColonne[i]);
    	}
    }
    
    
    public void seDeplacer(Personnage p) {
    	
    	if (p.getPointAction() >= 2) {
    		System.out.println();
    		System.out.println();
    		System.out.println();
    	    System.out.println("Saisissez la case où vous voulez vous déplacer");
    	    System.out.println("La lettre pour vous déplacer à gauche ou à droite");
    	    System.out.println("et le numéro de la ligne pour vous déplacer en haut ou en bas (Exemple: B-5)");
    	    
    	    this.addTab(p.getLigne(), p.getColonne(), null);
    	    
    	    Scanner sc1 = new Scanner(System.in);
    	    String position = sc1.nextLine();
    	    p.convertPosition(position, this.dico);
    	    
    	    this.addTab(p.getLigne(), p.getColonne(), p);
    	        		
    		int PA = p.getPointAction();
    		int nouvPA = PA - 2;
    		p.setPointAction(nouvPA);
    		
    		System.out.println();
    		System.out.println();
    		System.out.println();
    		this.afficherCarte();
    	}
    	
    	else {
    		System.out.println("Vous n'avez pas assez de Point d'Action, veuiller choisir une autre action ou attendre d'avoir assez de point");
    	}
    }
    public Cases[][] getTabcases() {
		return Tabcases;
	}
    
    
    public Hashtable<Integer, String> getDico() {
    	return this.dico;
    }
    
  

    
}
