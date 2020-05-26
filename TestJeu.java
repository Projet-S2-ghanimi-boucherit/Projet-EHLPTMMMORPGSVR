import java.util.Timer;
import java.util.TimerTask;

public class TestJeu {

public static void main(String[] args){
	
	//int delay = 0; // Première exécution dans 5 secondes
	//int period = 180000; // Répéter toutes les secondes
	//Timer timer = new Timer(); 
	//this.PointAction = timer.scheduleAtFixedRate(new TimerTask() {	public int run()  { int pa = setPointAction(getPointAction() * getInitiative()); return pa; } }, delay, period); }
	
	Joueur J1 = new Joueur();
	Partie P1 = new Partie();
	J1.add(P1);
	System.out.println(J1);
	
	System.out.println(P1);
	P1.getCarte().afficherCarte();

	
	}

}
