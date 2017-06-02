package project.Model;

import project.Classes.Item;

public class Menu extends Item {
	private project.Model.Boisson Boisson;
	private project.Model.Accompagnement Accompagnement;
	private project.Model.Produit_principal Produit_principal;

	public Menu(project.Model.Boisson boisson, project.Model.Accompagnement accompagnement, project.Model.Produit_principal produit_principal) {
		this.Boisson = boisson;
		this.Accompagnement = accompagnement;
		this.Produit_principal = produit_principal;
	}

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


    public String toString() {
        return "Menu " + this + " : " + getProduit_principal() + " - " + getAccompagnement() + " - " + getBoisson();
    }
}
