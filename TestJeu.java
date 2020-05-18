public class TestJeu {

public static void main(String[] args){
	
	CarteDuJeu carte1 = new CarteDuJeu();
	
	Personnage p1 = new PJ ();
	Objet pot2 = new Potion("pot2","soin");
	
	p1.equiper(pot2);
	p1.affichePerso();
	
	System.out.println();
	System.out.println();
	
	carte1.afficherCarte();
	
	System.out.println();
	System.out.println();
	
	carte1.seDeplacer(p1);
	
	System.out.println();
	System.out.println();
	
	carte1.afficherCarte();
	
	}

}
