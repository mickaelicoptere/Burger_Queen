package project.Model;

import project.Init_produits;

import java.util.ArrayList;

public class Commande {
    private double prixCommande;
    private boolean aEmporter;
    private ArrayList<Item> commande;
    private Utilisateur buyer;
    public int nbItem;

    public Commande(boolean aEmporter, Utilisateur buyer) {
        this.aEmporter = aEmporter;
        commande = new ArrayList<>();
        this.buyer = buyer;
        this.nbItem = 0;
    }

    public double calcPrixCommande() {
        for (Item i : commande) {
            prixCommande += i.getPrix();
        }
        return prixCommande;
    }

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
            if (i.getLibelle() == nom)
                commande.remove(i);
        }
    }

    public Item getItem(String idtemp) {
        return Init_produits.items.get(idtemp);
    }

    public String getNameById(int id) {
        return this.commande.get(id).getLibelle();
    }


}