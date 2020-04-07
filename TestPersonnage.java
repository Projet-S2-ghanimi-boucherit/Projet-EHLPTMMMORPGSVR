import java.util.ArrayList;

public class TestPersonnage {

private static ArrayList<Object> c1;

public static void main(String[] args){
	
	c1 = new ArrayList<Object>();
	
	Objet pot1 = new Potion("pot1");
	Personnage p1 = new PJ ();
	System.out.println(p1);
	p1.Equiper(pot1);
	System.out.println(p1);
}

}