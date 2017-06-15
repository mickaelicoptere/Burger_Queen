package project.Model;

import java.util.ArrayList;

public class Commande {
	private double prixCommande;
	private boolean aEmporter;
    private ArrayList<Item> commande;
    private Utilisateur buyer;

    public Commande(boolean aEmporter, Utilisateur buyer) {
        this.aEmporter = aEmporter;
        commande = new ArrayList<Item>();
        this.buyer = buyer;
    }

    public double calcPrixCommande() {
        for ( Item i : commande ) {
            prixCommande += i.getPrix();
        }
        return prixCommande;
    }

	public String toString() {
		return "Commande : "+ this + "\n" +
				"Prix : " + prixCommande + "\n" +
				"A Emporter : " + aEmporter
				;
	}

    public void addItem(Item newItem) {
        commande.add(newItem);
    }

    public void delItem(Item pastItem) {
        commande.remove(pastItem);
    }

    public void delItemName(String nom) {
        for ( Item i : commande ) {
            if (i.getLibelle() == nom)
                commande.remove(i);
        }
    }



}