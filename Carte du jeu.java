import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;


@objid ("d8955e8d-0654-42eb-be31-0796f7a7320f")
public class CarteDuJeu {
    @objid ("3ccdd2d2-12a2-4cd1-9bf3-f2885871fe6b")
    
    public Case[][] Tabcases;    
    
    @objid ("c88780de-3dd8-4ae2-9ed8-cf440a8603c0")
    public Partie partie;

    @objid ("22360b76-007c-4e18-967a-f1775622b664")
    public CarteDuJeu() {
    	 n = 6;
    	 this.Tabcases = new Case[n][n];
    	 System.out.println(Tabcases);
    }
    
    
    }

}
