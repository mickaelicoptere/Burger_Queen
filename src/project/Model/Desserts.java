package project.Model;

/**
 * Created by shuwn on 16/06/2017.
 */
public class Desserts extends Item {
    private String taille;

    public Desserts(String libelle, double prix, String taille) {
        super(libelle, prix);
        this.taille = taille;
    }
}
