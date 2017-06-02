package project.Classes;

import java.util.Vector;

public class Item {
    private String _libelle;
    private double _prix;
    public Vector<Promotion> _unnamed_Promotion_ = new Vector<>();
    public Vector<Commande> _unnamed_Commande_ = new Vector<>();

    public String getLibelle() {
        return this._libelle;
    }

    public void setLibelle(String aLibelle) {
        this._libelle = aLibelle;
    }

    public double getPrix() {
        return this._prix;
    }

    public void setPrix(double aPrix) {
        this._prix = aPrix;
    }
}