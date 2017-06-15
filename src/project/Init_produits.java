package project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import project.Model.*;


/**
 * Created by Virgile on 16/05/2017.
 * TU VOLES TU PAIES
 */

public class Init_produits extends Main {

    private static Boisson b1, b2, b3;
    public static Map<String, Item> items = new HashMap<>();
    private static Utilisateur u1;
    public static Commande c1;


    static void main() {
        b1 = new Boisson("Coca cola", 2.5, "XXL");
        b2 = new Boisson("Sale vodka", 25, "XXXXXL");
        b3 = new Boisson("Limonade", 1, "Pafou");

        items.put("b1", b1);
        items.put("b2", b2);
        items.put("b3", b3);

        u1 = new Utilisateur("Vivi", "Virgile", "virgile.bessiere@gmail.com", 0604074727, "fdpfdp83", false);
        c1 = new Commande(false, u1);
    }


}