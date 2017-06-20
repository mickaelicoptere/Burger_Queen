package project.Model;


import java.util.ArrayList;
import java.util.List;

public class Accompagnement extends Item {
    private String taille;
    private List<Ingredient> composition;

    public Accompagnement(String libelle, double prix, String taille) {
        super(libelle, prix);
        this.taille = taille;
        composition = new ArrayList<Ingredient>();
    }

    public String getTaille() {
        return this.taille;
    }

    public String toString() {
        return "Accompagnement " + this + "\n" +
                "Taille='" + taille + '\''
                ;
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