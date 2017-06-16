package project;

import project.Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Virgile on 16/05/2017.
 * TU VOLES TU PAIES
 */

public class Init_produits extends Main {

    public static Map<String, Item> items = new HashMap<>();
    public static Commande c1;
    private static Boisson b1, b2, b3;
    private static Ingredient i1, i2, i3, i4, i5, i6;
    private static Allergene a1, a2, a3, a4, a5, a6, a7, a8;
    private static Preference p1, p2, p3, p4, p5, p6;
    private static Produit_principal pp1, pp2, pp3, pp4;
    private static Utilisateur u1;
    private static ArrayList<Boisson> boissons;
    private ArrayList<Ingredient> ingredients;
    private ArrayList<Allergene> allergenes;
    private ArrayList<Preference> preferences;
    private ArrayList<Produit_principal> produitprincipaux;



    static void main() {
        //b1 = new Boisson("Coca cola", 2.5, Taille.TrèsGros);
//        b2 = new Boisson("Sale vodka", 25, "XXXXXL");
//        b3 = new Boisson("Limonade", 1, "Pafou");

        b1 = new Boisson(MarqueBoissons.Cola.libelle, 2.5, Taille.TrèsGros.libelle);
        b2 = new Boisson(MarqueBoissons.EauMinerale.libelle, 30, Taille.Gros.libelle);
        b3 = new Boisson(MarqueBoissons.limonade.libelle, 1.75, Taille.Morbide.libelle);

        pp1 = new Produit_principal("NotAWhooper", 4.5, "blabla");
        pp2 = new Produit_principal("Carnivor", 5.35, "blabla");
        pp3 = new Produit_principal("LE KASDALLEUR", 7.15, "blabla");
        pp4 = new Produit_principal("Chick King", 6.70, "blabla");

        items.put("b1", b1);
        items.put("b2", b2);
        items.put("b3", b3);

        items.put("pp1", pp1);
        items.put("pp2", pp2);
        items.put("pp3", pp3);
        items.put("pp4", pp4);

        u1 = new Utilisateur("Vivi", "Virgile", "virgile.bessiere@gmail.com", 0604074727, "fdpfdp83", false);
        c1 = new Commande(false, u1);
    }


}