package project.Model;

import java.util.*;

public class Boisson extends Item {
    private String taille;


    public Boisson(String libelle, double prix, String taille) {
        super(libelle, prix);
        this.taille = taille;
    }

    public String getTaille() {
        return this.taille;
    }

    public void setTaille(String Taille) {
        this.taille = Taille;
    }


}