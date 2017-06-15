package project.Model;

/**
 * Created by shuwn on 15/06/2017.
 */
public enum ListeIngredients {
    Salade("Salade"),
    Tomate("Tomate"),
    Oignons("Oignons"),
    Cornichons("Cornichons"),
    Courgettes("Courgettes"),

    Boeuf("Boeuf"),
    Poulet("Poulet"),
    Chien("Chien"),;

    public final String libelle;

    ListeIngredients(String libelle) {
        this.libelle = libelle;
    }
}

