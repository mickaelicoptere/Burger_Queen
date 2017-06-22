package project.Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import project.Controllers.Controller;

import java.util.ArrayList;
import java.util.Date;

public abstract class Item {
    private String libelle;
    private ArrayList<Promotion> promotions;
    private String img;
    private double prix;
    private boolean promotion;
    private double prixPromo;

    public Item(String libelle, double prix) {
        this.libelle = libelle;
        this.prix = prix;
        promotion = false;
        prixPromo = Double.NaN;
    }

    public String getLibelle() {
        return this.libelle;
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

    public ImageView getImg(String debug) {
        Image img = new Image(Controller.class.getResourceAsStream(debug));
        ImageView imgView = new ImageView();
        imgView.setImage(img);
        return imgView;

    }


}