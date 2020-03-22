package projetTutore;

import java.util.ArrayList;

public class TestObjet {

static boolean main(String[] args){

	Objet potion1 = new Objet();
	ArrayList ListeTest = new ArrayList();

	//Tu testes les methodes en dessous ensuite
	Boolean testMethode = false;

	//equiper (change le nom de lobjet par potion1)
	if(testMethode == false){
	potion1.Equiper(); 
	return true;
			//return true si le add est fait et rien si add pas fait
	}


	if(testMethode == false){
	//desequiper
	potion1.Desequiper(); //return true si le add est fait et rien si add pas fait
	return true;
	}

	//FIN TEST
}

} 


