package project.Classes;

import java.util.Vector;

public class Utilisateur {
    private String _nom;
    private String _prenom;
    private String _mail;
    private int _tel;
    private int _id;
    private String _mdp;
    private boolean _ice;
    public Preference _unnamed_Preference_;
    public Vector<Commande> _unnamed_Commande_ = new Vector<>();

    public String getNom() {
        return this._nom;
    }

    public void setNom(String aNom) {
        this._nom = aNom;
    }

    public String getPrenom() {
        return this._prenom;
    }

    public void setPrenom(String aPrenom) {
        this._prenom = aPrenom;
    }

    public String getMail() {
        return this._mail;
    }

    public void setMail(String aMail) {
        this._mail = aMail;
    }

    public int getTel() {
        return this._tel;
    }

    public void setTel(int aTel) {
        this._tel = aTel;
    }

    public int getId() {
        return this._id;
    }

    public void setId(int aId) {
        this._id = aId;
    }

    public String getMdp() {
        return this._mdp;
    }

    public void setMdp(String aMdp) {
        this._mdp = aMdp;
    }

    public void changeMdp(Object aString_newMdp) {
        throw new UnsupportedOperationException();
    }

    public void changeMail(Object aString_newMail) {
        throw new UnsupportedOperationException();
    }

    public void changeTel(Object aInt_newTel) {
        throw new UnsupportedOperationException();
    }

    public void addMail(Object aString_newMail) {
        throw new UnsupportedOperationException();
    }

    public void addTel(Object aInt_newTel) {
        throw new UnsupportedOperationException();
    }

    public boolean getIce() {
        return this._ice;
    }

    public void setIce(boolean aIce) {
        this._ice = aIce;
    }

    public void getAttribute() {
        throw new UnsupportedOperationException();
    }

    public void setAttribute(Object aAttribute) {
        throw new UnsupportedOperationException();
    }
}