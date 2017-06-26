package project;

import com.jfoenix.controls.JFXListView;
import project.Model.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;


/**
 * Created by Virgile on 16/05/2017.
 * TU VOLES TU PAIES
 */

//TODO Voir si on instancie tous les items à taille variable dans toutes les tailles disponible
//TODO Faire un FXML systeme de paiement
//TODO instanciation des allergènes et ingrédients
public class Init_produits extends Main {

    public static Map<String, Item> items = new HashMap<>();
    public static Map<String, Ingredient> ingredients = new HashMap<>();

    public static Commande c1;
    private static Boisson b1, b2, b3;
    //private static Allergene a1, a2, a3, a4, a5,a6, a7, a8;
    private static Preference p1, p2, p3, p4, p5, p6;
    private static Produit_principal pp1, pp2, pp3, pp4, pp5, pp6, pp7, pp8, pp9, pp10, ecm1, ecm2, ecm3;
    private static APasCher apc1, apc2, apc3, apc4;
    private static Desserts d1, d2, d3;
    private static Accompagnement a1, a2;
    private static Utilisateur u1;
    private static ArrayList<Boisson> boissons;
    private static Ingredient i1, i2, i3, i4, i5, i6;
    private ArrayList<Allergene> allergenes;
    private ArrayList<Preference> preferences;
    private ArrayList<Produit_principal> produitprincipaux;
    public static int nbBurgers, nbBoissons, nbAccompagnements, nbApascher, nbDesserts, nbEncemoment, nbIngredients;



    static void main() {

        b1 = new Boisson(MarqueBoissons.Cola.libelle,2.5 , Taille.TrèsGros.libelle);
        b2 = new Boisson(MarqueBoissons.EauMinerale.libelle, 30, Taille.Gros.libelle);
        b3 = new Boisson(MarqueBoissons.limonade.libelle, 1.75, Taille.Morbide.libelle);
        nbBoissons = 3;

        pp1 = new Produit_principal("NotAWhooper", 4.5, "blabla");
        pp2 = new Produit_principal("Carnivor", 5.35 ,"blabla");
        pp3 = new Produit_principal("LE KASDALLEUR", 7.15 ,"blabla");
        pp4 = new Produit_principal("Chick King", 6.70 ,"blabla");

        nbBurgers = 4;

        ecm1 = new Produit_principal("Dark Burger", 7, "blabla");
        ecm2 = new Produit_principal("Croissant Burger", 6.2, "blabla");
        ecm3 = new Produit_principal("Normal Burger", 6, "blabla");
        nbEncemoment = 3;

        d1 = new Desserts("Milkshake", 5.30, Taille.Gros.libelle);
        d2 = new Desserts("Madeleines IUT Nice", 2, Taille.Morbide.libelle);
        d3 = new Desserts("Sucre d'orge ♥", 500, Taille.TrèsGros.libelle);
        nbDesserts = 3;

        apc1 = new APasCher("Bagel", 4, "blabla");
        apc2 = new APasCher("FishBurger", 2, "blabla");
        apc3 = new APasCher("SmallMac", 1.95, "blabla");
        apc4 = new APasCher("Poulet enroulé", 3, "blabla");
        nbApascher = 4;

        a1 = new Accompagnement("Frites", 2.5, Taille.TrèsGros.libelle);
        a2 = new Accompagnement("Potatoes", 2.5, Taille.Gros.libelle);
        nbAccompagnements = 2;

        items.put("b1", b1);
        items.put("b2", b2);
        items.put("b3", b3);

        items.put("pp1", pp1);
        items.put("pp2", pp2);
        items.put("pp3", pp3);
        items.put("pp4", pp4);



        items.put("ecm1", ecm1);
        items.put("ecm2", ecm2);
        items.put("ecm3", ecm3);

        items.put("d1", d1);
        items.put("d2", d2);
        items.put("d3", d3);

        items.put("apc1", apc1);
        items.put("apc2", apc2);
        items.put("apc3", apc3);
        items.put("apc4", apc4);

        items.put("a1", a1);
        items.put("a2", a2);

        i1 = new Ingredient("Bacon");
        i2 = new Ingredient("Salade");
        i3 = new Ingredient("Pain");
        i4 = new Ingredient("Tomate");
        i5 = new Ingredient("Pain rouge");
        i6 = new Ingredient("J't'ai casshé (steak haché, mdrrr");
        ingredients.put("i1", i1);
        ingredients.put("i2", i2);
        ingredients.put("i3", i3);
        ingredients.put("i4", i4);
        ingredients.put("i5", i5);
        ingredients.put("i6", i6);
        nbIngredients = 6;

        u1 = new Utilisateur("Vivi", "Virgile", "virgile.bessiere@gmail.com", "0604074727", "fdpfdp83", false);
        c1 = new Commande(false, u1);
    }

    public static Map<String, Ingredient> getHashmap() {
        return ingredients;
    }

    public static void createBurger(ArrayList<Ingredient> listeRecette, String nom, double prix, String description) {
        int i = 1;
        while (items.get("pp" + i) != null) {
            i++;
        }
        if (items.get("pp" + i) == null) {
            items.put("pp" + i, new Produit_principal(nom, prix, description));
            Produit_principal ptemp = (Produit_principal) items.get("pp" + i);
            while (listeRecette.isEmpty() == false) {
                ptemp.addIngredient(listeRecette.get(0), new Composition(true, false, false));
                listeRecette.remove(0);
            }
            items.put("pp" + i, ptemp);
            nbBurgers++;
        }
    }

}