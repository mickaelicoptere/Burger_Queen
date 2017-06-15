package project.Model;

import java.util.List;

public class Ingredient {
    private boolean presenceStock;
    private String libelle;
    private List<Allergene> allergene;

    public Ingredient(String libelle) {
        this.libelle = libelle;
    }

    public boolean isPresenceStock() {
        return presenceStock;
    }

    public void setPresenceStock(boolean presenceStock) {
        this.presenceStock = presenceStock;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public String toString() {
        return "Ingredient{" +
                "presenceStock=" + presenceStock +
                ", libelle='" + libelle + '\'' +
                ", allergene=" + allergene.toString() +
                '}';
    }

    public void addAllergene(Allergene newAllergene) {
        allergene.add(newAllergene);
    }

    public void delAllerge(Allergene pastAllergene) {
        allergene.remove(pastAllergene);
    }

    public String listAllergene() {
        String listallergene = "";
        for ( Allergene A : allergene ) {
            listallergene += A.getLibelle();
        }
        return listallergene;
    }
}