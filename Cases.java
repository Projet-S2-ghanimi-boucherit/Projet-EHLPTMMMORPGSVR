import com.modeliosoft.modelio.javadesigner.annotations.objid;
private Objet obj;
private Personnage pj;

n = 8;
this.Cases = new Case[n][n];

@objid ("83ca437f-4a9e-4654-98b4-c6627917aa32")
public class Cases {

    @objid ("a1170c8b-92d1-4206-8949-aaee12374d34")
    private int ligne;

    @objid ("32af6bd1-19e2-4d6e-91b6-90290c829e3d")
    private int colonne;

    @objid ("a49d6354-169d-4a2e-822a-3629cfb0c855")
    public void ContenuCases() {
    }
 
    @objid ("5bed852d-a3bb-46f1-b2ef-7db2c3fcfa3f")
    public void AddObjet() {
    	
    }
    	
    }
    	
    

    @objid ("6f147c26-276d-4c58-b789-0eab7cf5c075")
    int getNumeroCase() {
        return this.numeroCase;
    }

    @objid ("dae41ae5-4c42-47f3-922b-467e5f52bf4f")
    void setNumeroCase(int value) {
        this.numeroCase = value;
    }

    @objid ("6afeba1b-4ee2-4979-a19a-05129ac42084")
    public Cases(int ligne, int colonne)) {
    	this.ligne=ligne;
    	this.colonne=colonne;
    
    public void getObj() {
    	return this.obj;
    }
    public void setObj(Objet nouvobj) {
    	this.obj= nouvObj;
    	}
    private void getPj() {
    	this.pj=pj;
    	
    	}
    private void setPj(Personnage newpj) {
    		this.pj=newpj;
    
      	}
    
    
    

}
