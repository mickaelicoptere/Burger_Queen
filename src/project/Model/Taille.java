package project.Model;

/**
 * Created by shuwn on 15/06/2017.
 */
public enum Taille {
    Gros("Gros"),
    TrèsGros("Très Gros"),
    Morbide("Morbide");

    public final String libelle;

    Taille(String libelle) {
        this.libelle=libelle;
    }
}
