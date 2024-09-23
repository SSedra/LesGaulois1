package personnages;

public class gaulois {
	private String nom;
	private int force;
	private int effetPotion = 1;
	
	
	public gaulois(String nom, int force) {
		this.nom = nom;
		this.force = force;
		
		}
	public String getNom() {
		return nom;
	}
	public void parler(String texte) {
		System.out.println(prendreParole()+"<<" + texte +">>");
		
	}

	private String prendreParole() {
		return "le gaulois"+ nom +" : ";
	}
	public void frapper(Romain romain) {
		System.out.println(nom +"frappe"+romain.getNom());
		romain.recevoirCoups(force/3);
		
		
	}
	
	
	@Override
	public String toString() {
		return "gaulois [nom=" + nom + ", force=" + force + ", effetPotion=" + effetPotion + "]";
	}
	public static void main(String[] args) {
		
	}

}


