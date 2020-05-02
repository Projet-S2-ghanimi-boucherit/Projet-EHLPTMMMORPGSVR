public class CarteDuJeu {
    
    public Cases[][] Tabcases;
    private char[] AlphColonne = { 'A', 'B', 'C', 'D', 'E', 'F'};
    private int[] NumLigne = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20};

    public CarteDuJeu() {
    	 this.Tabcases = new Cases[20][6];
    }
    
    public void addTab (int colonne, int ligne, Object nouvObj){
    	this.Tabcases[colonne][ligne].setObj(nouvObj);
    }
    
    public void afficherCarte() {
    	for (int i = 0; i < Tabcases.length; i++) {
    		
    		System.out.print (NumLigne[i] + "  ");
    		
             for (int j = 0;j < Tabcases[i].length;j++) {
                System.out.print("	" + Tabcases[i][j]);
             }
             System.out.println();
          }
    	System.out.println();
    	for (int i = 0; i < AlphColonne.length; i++) {
    		System.out.print("	" + AlphColonne[i]);
    	}
    }
}
