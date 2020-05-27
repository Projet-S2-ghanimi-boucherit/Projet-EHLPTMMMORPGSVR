package projetTutore;

public class Cases {

    private int ligne;
    private int colonne;
    private Object object;

    public Cases(int x, int y, Objet obj) {
    	this.ligne = x ;
    	this.colonne = y ;
    	this.object = obj;
    }

    public Object ContenuCases(int Colonne, int ligne) {
    	return this.object;
    }
    	
    public int getColonne() {
        return this.colonne;
    }

   
    public void setColonne(int val) {
        this.colonne = val;
    }

   
    public int getLigne() {
        return this.ligne;
    }

    
    public void setLigne(int val) {
        this.ligne = val;
    }

    public Object getObj() {
    	return this.object;
    }
    public void setObj(Object nouvObj) {
    	this.object = nouvObj;
    }


    public String toString() {
		String s;
		s = "" + this.object;
		return s;

	}
    
}
