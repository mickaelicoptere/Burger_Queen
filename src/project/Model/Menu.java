/*package project.Model;

import project.Classes.Item;

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
>>>>>>> Stashed changes

	public void addAccomp(Accompagnement newAccomp) {
		Accompagnement = newAccomp;
	}

<<<<<<< Updated upstream
    public project.Model.Boisson getBoisson() {
        return Boisson;
    }

    public void setBoisson(project.Model.Boisson boisson) {
        Boisson = boisson;
    }

    public project.Model.Accompagnement getAccompagnement() {
        return Accompagnement;
    }

    public void setAccompagnement(project.Model.Accompagnement accompagnement) {
        Accompagnement = accompagnement;
    }

    public project.Model.Produit_principal getProduit_principal() {
        return Produit_principal;
    }

    public void setProduit_principal(project.Model.Produit_principal produit_principal) {
        Produit_principal = produit_principal;
    }

=======
	public void addBoisson(Boisson newBoisson) {
		boisson = newBoisson;
	}

	public void delBoisson(){
		boisson = null;
	}

	public void delAccompagnements(){
		Accompagnement = null;
	}

    public String toString() {
        return "Menu " + this + " : " + getProduit_principal() + " - " + getAccompagnement() + " - " + getBoisson();
    }
}*/
