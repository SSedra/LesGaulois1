package personnages;

public class Chef {
	private String nom;
	private int force;
	private int effetPotion = 1;
	private Village village;
	
	
	public Chef(String nom, int force, int effetPotion, Village village) {
		this.nom = nom;
		this.force = force;
		this.effetPotion = effetPotion;
		this.village = village;
	}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<" + texte +">>");
		
	}

	private String prendreParole() {
		return "le chef"+ nom +" du village " + village.getNom()+" : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom +"frappe"+romain.getNom());
		romain.recevoirCoups(force/3);
	}

}
