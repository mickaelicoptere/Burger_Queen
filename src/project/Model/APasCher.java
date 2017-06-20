package project.Model;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Remy on 15/06/2017.
 */
public class APasCher extends Item {
    private String description;
    private List<Ingredient> composition;

    public APasCher(String libelle, double prix, String description, Image img) {
        super(libelle, prix, img);
        this.description = description;
        composition = new ArrayList<Ingredient>();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void addIngredient(Ingredient newIngredient) {
        composition.add(newIngredient);
    }

    public void delIngredient(Ingredient pastIngredient) {
        composition.remove(pastIngredient);
    }

    public String listIngredient() {
        String ingredient = "";
        for ( Ingredient I : composition ) {
            ingredient += I.getLibelle();
        }
        return ingredient;
    }

    public String listAllergene() {
        String allergene = "";
        for ( Ingredient I : composition ) {
            allergene += I.getLibelle();
        }
        return allergene;
    }
}
