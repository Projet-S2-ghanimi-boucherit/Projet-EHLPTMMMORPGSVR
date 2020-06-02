package projetTutore;


public class TestJeu {

public static void main(String[] args){
	
	
	Joueur J1 = new Joueur();
	Partie P1 = new Partie();

	J1.add(P1); // Ajout de la nouvelle partie dans la liste de partie du joueur

	P1.ChoixAction(); //Lance le jeu
	

	
	}

}
