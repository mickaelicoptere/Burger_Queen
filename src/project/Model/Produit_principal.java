package project.Model;

import java.util.Arrays;


public class Produit_principal extends Item {

    private String description;
    private Ingredient[] composition = {};

//    public HashMap<String, Double> menuproduitprincipal = new HashMap<>(libelle, prix);

    public Produit_principal(String libelle, double prix, String description) {
        super(libelle, prix);
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String toString() {
        return "Produit_principal{" +
                "description='" + description + '\'' +
                ", composition=" + Arrays.toString(composition) +
                '}';
    }

    public void addIngredient(Ingredient newIngredient) {
        int i = 0;
        while ((i < composition.length) && (composition[i] == null)) {
            i++;
        }
        if (composition[i] == null) {
            composition[i] = newIngredient;
        }
    }

    public void delIngredient(Ingredient pastIngredient) {
        int i = 0;
        while ((i < composition.length) && (composition[i] != pastIngredient)) {
            i++;
            if (composition[i].equals(pastIngredient)) {
                composition[i] = null;
                for ( int j = i; j < composition.length; j++ ) {
                    composition[j] = composition[j + 1];
                }
            }
        }
    }

    public Ingredient[] listIngredient() {
        return composition;
    }

    public String listAllergne() {
        String list = null;
        for ( int i = 0; i < composition.length; i++ ) {
            list += composition[i].listAllergene();
        }
        return list;
    }

}