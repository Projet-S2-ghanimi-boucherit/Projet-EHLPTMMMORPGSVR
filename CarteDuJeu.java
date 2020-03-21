import java.util.ArrayList;
import java.util.List;
import com.modeliosoft.modelio.javadesigner.annotations.objid;

public class CarteDuJeu {
    
    public Case[][] Tabcases;    
    
    public Partie partie;

    public CarteDuJeu() {

    	//tu créé ta carte de jeu
    	 n = 6;
    	 this.Tabcases = new Case[n][n];

    	 //appelles la methode setObj() sur une case pour 
    	 //placer ton personnage dès création de la carte
    	//Exemple avec le jeu d'echec : this.Cases[0][0].setPiece( new Roi() );




    }
    
    
    }
