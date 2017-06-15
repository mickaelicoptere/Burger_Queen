package project.Model;

import java.util.*;

public abstract class Item {
    protected String libelle;
    private double Prix;
    private Promotion[] listePromotion = {};

//    HashMap<String, Double> items = new HashMap<String, Double>();
//    items.put("burger1", 4.00);


    public Item(String libelle, double prix) {
        this.libelle = libelle;
        this.Prix = prix;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    double getPrix() {
        return Prix;
    }

    public void setPrix(int prix) {
        Prix = prix;
    }


    public String toString() {
        return "Item{" +
                "libelle='" + libelle + '\'' +
                ", Prix=" + Prix +
                '}';
    }

    public void addPromo(Promotion promo) {
        int i = 0;
        while ((i < listePromotion.length) && (listePromotion[i] == null)) {
            i++;
        }
        if (listePromotion[i] == null) {
            listePromotion[i] = promo;
        }
    }

    public void delPromoFin() {
        listePromotion[listePromotion.length - 1] = null;
    }

    public void delPromoDate(Date fin) {
        for (int i = 0; i < listePromotion.length; i++) {
            if (listePromotion[i].getDateFin().after(fin)) {
                listePromotion[i] = null;
                for (int j = i; j < listePromotion.length; j++) {
                    listePromotion[j] = listePromotion[j + 1];
                }
            }
        }
    }

    public void delPromo(Promotion promo) {
        int i = 0;
        while ((i < listePromotion.length) && (listePromotion[i] != promo)) {
            i++;
            if (listePromotion[i].equals(promo)) {
                listePromotion[i] = null;
                for (int j = i; j < listePromotion.length; j++) {
                    listePromotion[j] = listePromotion[j + 1];
                }
            }
        }
    }


}