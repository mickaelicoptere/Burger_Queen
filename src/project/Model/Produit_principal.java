package project.Model;

import java.awt.*;
import java.util.HashMap;
import java.util.Map;

public class Produit_principal extends Item {
    private String description;
    private Map<Ingredient, Composition> composition;

    public Produit_principal(String libelle, double prix, String description) {
        super(libelle, prix);
        this.description = description;
        composition = new HashMap<Ingredient, Composition>();
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
                ", composition=" + composition.toString() +
                '}';
    }

    public void addIngredient(Ingredient newIngredient, Composition newComposition) {
        composition.put(newIngredient, newComposition);
    }

    public void delIngredient(Ingredient pastIngredient) {
        composition.remove(pastIngredient);
    }

    public String listIngredient() {
        return composition.toString();
    }

    public String listAllergene() {
        String allergene = "";
        for ( Map.Entry<Ingredient, Composition> entry : composition.entrySet() ) {
            allergene += entry.getKey().listAllergene();
        }
        return allergene;
    }

}