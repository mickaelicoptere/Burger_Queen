package project.Model;

/**
 * Created by shuwn on 15/06/2017.
 */
public enum ListeSauces {
    Barbecue("Barbecue"),
    Ketchup("Ketchup"),
    Mayonnais("Mayonnaise"),
    Sauce_blanche("Sauce Blanche"),
    Szechuan_Sauce("Szechuan Sauce");

    private final String libelle;

    ListeSauces(String libelle) {
        this.libelle = libelle;
    }
}
