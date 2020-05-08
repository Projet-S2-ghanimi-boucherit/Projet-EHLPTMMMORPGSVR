
public class Vêtement extends Objet {
	private int protection;
	private boolean Consommable;
	private Personnage perso;
	
	 public Vêtement(String  nom, int protection) {
		super(nom, nom);
	 	this.Consommable = Consommable;
	 	this.protection = protection;
	 	
 
	 }
	 public void protection(int indice){
		 perso.setDefense(perso.getDefense()+indice);
		 System.out.println(perso.getDefense());
		 
		 
	 }
	 
	  public int getProtection() {
		return this.protection;
	}
	public void setProtection(int nouvprotection) {
		this.protection = nouvprotection;
	}

	@Override
	public void setNom(String nom) {
		// TODO Auto-generated method stub
		super.setNom(nom);
	}
	@Override
	public String getNom() {
		// TODO Auto-generated method stub
		return super.getNom();
	}
	
	
	
	//EXTEND -> donc hérite de toute les methodes et attribues inutile de les réécrire ramasser, equipé, desequiper

}

