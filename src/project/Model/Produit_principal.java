package project.Model;


import java.util.ArrayList;


public class Produit_principal extends Item {
    private String description;
    private ArrayList<Ingredient> composition;

    public Produit_principal(String description, String libelle, double prix) {
        super(libelle, prix);
        this.description = description;
        composition = new ArrayList<Ingredient>();
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
        composition.add(newIngredient);
    }

    public void delIngredient(Ingredient pastIngredient) {
        composition.remove(pastIngredient);
    }

    public String listIngredient() {
        return composition.toString();
    }

    public String listAllergene() {
        String allergene = "";
        for ( Ingredient I : composition ) {
            allergene += I.listAllergene();
        }
        return allergene;
    }

}