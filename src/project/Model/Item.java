package project.Model;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import project.Controllers.Controller;

import java.util.ArrayList;
import java.util.Date;

public abstract class Item {
    private String libelle;
    private double Prix;
    private ArrayList<Promotion> promotions;
    private String img;

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
            if (p.getDateFin().after(fin)) {
                promotions.remove(p);
            }
        }
    }

    public void delPromo(Promotion promo) {
        promotions.remove(promo);
    }


    public ImageView getImg(String debug) {
        Image img = new Image(Controller.class.getResourceAsStream(debug));
        ImageView imgView = new ImageView();
        imgView.setImage(img);
        return imgView;

    }


}