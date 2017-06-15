//package project.Model; TODO A DECOMMENTER QUAND LA CLASSE SERA FONCTIONNELLE SINON ON NE PEUT PAS EXECUTER LE PROG
//
//import java.util.ArrayList;
//
///**
// * Created by shuwn on 13/06/2017.
// */
//public class Restaurant {
//
//    private ArrayList<Produit_principal> produitprincipaux;
//    private ArrayList<Boisson> boissons;
//    private ArrayList<Ingredient> ingredients;
//    private ArrayList<Allergene> allergenes;
//    private ArrayList<Preference> preferences;
//
//    private Restaurant instance;
//
//    private Restaurant() {
//        produitprincipaux = new ArrayList<Produit_principal>();
//        boissons = new ArrayList<Boisson>();
//        ingredients = new ArrayList<Ingredient>();
//        allergenes = new ArrayList<Allergene>();
//        preferences = new ArrayList<Preference>();
//        productInitialization();
//    }
//
//    public Restaurant getRestaurant() {
//        if (instance == null)
//            instance = new Restaurant();
//        return instance;
//    }
//
//    public ArrayList<Produit_principal> getProduitprincipaux() {
//        return produitprincipaux;
//    }
//
//    public ArrayList<Boisson> getBoissons() {
//        return boissons;
//    }
//
//    public ArrayList<Ingredient> getIngredients() {
//        return ingredients;
//    }
//
//    public ArrayList<Allergene> getAllergenes() {
//        return allergenes;
//    }
//
//    public ArrayList<Preference> getPreferences() {
//        return preferences;
//    }
//
//    private void productInitialization() {
//        this.boissons.add(new Boisson(Taille.Morbide, MarqueBoissons.EauMinerale.libelle, 9));
//        this.boissons.add(new Boisson(Taille.TrèsGros, MarqueBoissons.limonade.libelle, 2.15));
//
//        this.produitprincipaux.add(new Produit_principal("Blabla", "Burger1", 9.15));
//
//        this.produitprincipaux.add(new Produit_principal("Blabla", "Burger2", 3.75));
//        //TODO méthode pour ajouter Item as manager
//
//    }
//}
