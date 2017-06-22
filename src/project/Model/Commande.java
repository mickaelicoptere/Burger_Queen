package project.Model;

import project.Init_produits;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Commande {
    public int nbItem;
    private double prixCommande;
    private boolean aEmporter;
    public ArrayList<Item> commande;
    private Utilisateur buyer;

    public Commande(boolean aEmporter, Utilisateur buyer) {
        this.aEmporter = aEmporter;
        commande = new ArrayList<>();
        this.buyer = buyer;
        this.nbItem = 0;
    }

    public double calcPrixCommande() {
        prixCommande = 0.0;
        for (Item i : commande) {
            prixCommande += i.getPrix();
        }
        prixCommande = round(prixCommande, 2);
        return prixCommande;
    }

    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    @Override
    public String toString() {
        return "Commande : " + this + "\n" +
                "Prix : " + prixCommande + "\n" +
                "A Emporter : " + aEmporter
                ;
    }

    public void addItem(String idTemp) {
        commande.add(Init_produits.items.get(idTemp));
        this.nbItem++;
    }

    public void delItem(Item pastItem) {
        commande.remove(pastItem);
    }

    public void delItemName(String nom) {
        for (Item i : commande) {
            if (i.getLibelle() == nom) {
                //                commande.remove(i);

            }
        }
    }

    public Item getItem(String idtemp) {
        return Init_produits.items.get(idtemp);
    }

    public String getNameById(int id) {
        return this.commande.get(id).getLibelle();
    }

    public String listCommande() {
        String list = "";
        for ( Item i : commande ) {
            list += " - " + i.getLibelle() + " " + i.getPrix() + "\n";
        }
        return list;
    }
}