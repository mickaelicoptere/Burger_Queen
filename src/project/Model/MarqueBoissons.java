package project.Model;

/**
 * Created by shuwn on 15/06/2017.
 */
public enum MarqueBoissons {
    Cola("Cola"),
    EauMinerale("Eau"),
    limonade("Limonade");

    public final String libelle;

    MarqueBoissons(String libelle) {
        this.libelle = libelle;
    }
}
