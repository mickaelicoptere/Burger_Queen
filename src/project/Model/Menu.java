package project.Model;

public class Menu extends Item {
	private Boisson boisson;
	private Accompagnement Accompagnement;
	private Produit_principal Produit_principal;


	public Menu(Produit_principal Sandwich, String libelle, double prix) {
		super(libelle, prix);
		Produit_principal = Sandwich;
		boisson = null;
		Accompagnement = null;
	}

	public void addAccomp(Accompagnement newAccomp) {
		Accompagnement = newAccomp;
	}

	public void addBoisson(Boisson newBoisson) {
		boisson = newBoisson;
	}

	public void delBoisson() {
		boisson = null;
	}

	public void delAccompagnements() {
		Accompagnement = null;
	}

}