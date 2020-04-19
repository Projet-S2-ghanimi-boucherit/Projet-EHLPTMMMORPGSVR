
import java.util.ArrayList;

public class TestPersonnage {

private static ArrayList<Object> c1;

public static void main(String[] args){
	
	c1 = new ArrayList<Object>();
	
	//TEST PAR ALICE LE DIMANCHE 19 AVRIL
	
	Personnage p1 = new PJ ();
	
	Objet pot2 = new Potion("pot2","soin");

	p1.equiper(pot2);
	p1.affichePerso();
	
	p1.useObject(pot2);
	p1.affichePerso();
	
	}

}
