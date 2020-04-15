package projetTutore;

public class Potion extends Objet {
	private Personnage perso;
	private int efficacite; 
	private boolean Consommable;
	
	
	public Potion(String nom) {
		super(nom);
		this.Consommable = true; 
	}
		
  
    
    public Boolean getConsommable() {
		return Consommable;
	}
    public void setConsommable(Boolean consommable) {
		Consommable = consommable;
	
	}
    
    public int getEfficacite() {
		return efficacite;
	}
	
	public void setEfficacite(int efficacite) {
		this.efficacite = efficacite;
	}
}