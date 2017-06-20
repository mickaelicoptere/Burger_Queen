package project.Model;

import java.awt.*;

public abstract class Item {
    private String libelle;
    private double prix;
    private boolean promotion;
    private double prixPromo;
    private Image img;


    public Item(String libelle, double prix, Image img) {
        this.libelle = libelle;
        this.prix = prix;
        promotion = false;
        prixPromo = Double.NaN;
        this.img = img;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix() {
        if (this.promotion)
            return prixPromo;
        else
            return prix;
    }

    public void setPrix(double prix) {
        this.prix = prix;
    }

    public String toString() {
        return "Item{" +
                "libelle='" + libelle + "\'" +
                ", Prix=" + prix + "\n" + "}";
    }

    public void addPromo(double prix) {
        promotion = true;
        prixPromo = prix;
    }

    public void delPromo() {
        promotion = false;
        prixPromo = Double.NaN;
    }

    public Image getImg() {
        return img;
    }

    public void setImg(Image img) {
        this.img = img;
    }

    public void delImg() {
        img = null;
    }
}