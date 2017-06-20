package project.Model;

import java.util.ArrayList;
import java.util.Date;

public abstract class Item {
    private String libelle;
    private double Prix;
    private ArrayList<Promotion> promotions;

    public Item(String libelle, double prix) {
        this.libelle = libelle;
        Prix = prix;
        promotions = new ArrayList<>();
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        return Prix;
    }

    public void setPrix(double prix) {
        Prix = prix;
    }


    public String toString() {
        return "Item{" +
                "libelle='" + libelle + "\'" +
                ", Prix=" + Prix + "\n" +
                ", Promotion=" + promotions.toString() +
                "}";
    }

    public void addPromo(Promotion promo) {
        promotions.add(promo);
    }

    public void delPromoFin() {
        promotions.remove(promotions.size() - 1);
    }

    public void delPromoDate(Date fin) {
        for ( Promotion p : promotions ) {
            if (p.getDateFin().after(fin)) ;
        }
    }

    public void delPromo(Promotion promo) {
        promotions.remove(promo);
    }
}