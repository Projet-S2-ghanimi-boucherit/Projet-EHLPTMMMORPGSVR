import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class Cases {

	private Object obj;

    private int ligne;

    private int colonne;

    public Cases(int ligne, int colonne)) {
    	this.ligne=ligne;
    	this.colonne=colonne;

    }

    public Objet ContenuCases(int Colonne, int ligne) {
    	return this.Case[colonne][ligne];
    }

    public void AddToCase (int colonne, int ligne, Object nouvObj){
    	this.Cases[Colonne][ligne].setObj(nouvObj);
    }

    	
    public int getColonne() {
        
    }

   
    public void setColonne(int val) {
        
    }

   
    public int getLigne() {
        
    }

    
    public void setLigne(int val) {
        
    }

    
    public Objet getObj() {
    	return this.obj;
    }
    public void setObj(Objet nouvObj) {
    	this.obj= nouvObj;
    }


    public String toString() {
		String s;

		// exemple sur le jeu d'echec : 
		// s= new String("Couleur: " + this.couleur +", Colonne : " + this.colonne + ", Rangee : " + this.rangee);

		s = new String(	Complète ici );

		return s;
	}
    
}
