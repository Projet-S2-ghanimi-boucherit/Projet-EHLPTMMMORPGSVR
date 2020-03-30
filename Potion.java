public class Potion extends Objet {
	
	private boolean Consommable;
	
	public Potion(String nom) {
		super(nom);
		this.Consommable = true;
    }

    public void Soin() {
    	int val = perso.getPointDeVIe()+5;
    	perso.setPointDeVIe(val);
    	//soigne de X point de vie (voir le sujet du projet)
    	// Donc dabord int val = getPointDeVie() + X point
    	//puis appelle la methode setPointDeVIe(int value) sur un personnage
    	//Tu fera sur le TestObjet pj.soin();
    }

    public void Molotov() {
        int val = perso.getPointDeVIe()-6;
    	perso.setPointDeVIe(val);
    	//enleve de X point de vie (voir le sujet du projet)
    	// Donc dabord int val = getPointDeVie() - X point
    	//puis appelle la methode setPointDeVIe(int value) sur un personnage
    	//Tu fera sur le TestObjet pj.molotov();
    }
    
    public Boolean getConsommable() {
		return Consommable;
	}
    public void setConsommable(Boolean consommable) {
		Consommable = consommable;
	}
}