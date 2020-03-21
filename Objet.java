import com.modeliosoft.modelio.javadesigner.annotations.objid;

//CLASSE ABSTRAITE DONC MET RIEN DANS LES METHODE ET CONSTRUCTEUR

public class abstract Objet {

    String Nom;
    Personnage perso;
    Boolean Consommable;

    public Objet(){
    	this.Consommable = null; //PAR DEFAUT CE SERA NULL
    	//Met tout les this à part personnage
    }

    public void Ramasser(){
    	//là pour l'instant je vois pas quoi faire 
    	//donc ce sera pour la v2

    };

    public void Equiper(){
    	// java doc de l'arraylist : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html
    	// dans la classe personnage il y a comme attribue:
    	// public ArrayList<Objet> ListObjet;
    	//Regarde la classe TestObjet pour que tu sache quoi faire


    };

    public void Desequiper(){
    	//Tu retire l'objet dans l'arrayList du personnage
    	// java doc de l'arraylist : https://docs.oracle.com/javase/7/docs/api/java/util/ArrayList.html

    };

    public String toString(){

    }

}