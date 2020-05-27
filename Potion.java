package projetTutore;


public class Potion extends Objet {
	private boolean Consommable;
	
	public Potion(String nom, String type) {
		super(nom,type);
		this.Consommable = true;
	}
		
  
    
    public Boolean getConsommable() {
		return Consommable;
	}
    public void setConsommable(Boolean consommable) {
		Consommable = consommable;
	
	}
}