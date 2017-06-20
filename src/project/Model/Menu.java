package project.Model;

public class Menu extends Item {
    private Boisson Boisson;
    private Accompagnement Accompagnement;
    private Produit_principal Produit_principal;


    public Menu(Produit_principal Sandwich, String libelle, double prix) {
        super(libelle, prix);
        Produit_principal = Sandwich;
        Boisson = null;
        Accompagnement = null;
    }

    public void addAccomp(Accompagnement newAccomp) {
        Accompagnement = newAccomp;
    }

    public void addBoisson(Boisson newBoisson) {
        Boisson = newBoisson;
    }

    public void delAccomp() {
        Accompagnement = null;
    }

    public void delBoisson() {
        Boisson = null;
    }

}