package project.Controllers;

import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import project.Init_produits;
import project.Main;

import java.lang.String;

import com.jfoenix.controls.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

import project.Model.*;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.xml.bind.annotation.XmlAccessorOrder;

import javafx.scene.image.ImageView;


public class Controller implements Initializable {

    private static String[] historique = new String[256];
    private static int lastHistorique;


    public AnchorPane Payer;
    @FXML
    public JFXTextField user;

    @FXML
    public JFXPasswordField pass;

    @FXML
    public AnchorPane MainAnchor;
    @FXML
    private JFXButton connexion;
    @FXML
    private FlowPane MaCommande;

    @FXML
    private ListeCommandeController MaCommandeController;

    @FXML
    private JFXComboBox<String> ListeIngredients = new JFXComboBox<>();

    @FXML
    private ControllerBurgers BurgersController;

    @FXML
    private GridPane gridBurgers = new GridPane();

    @FXML
    private JFXScrollPane scrollPane = new JFXScrollPane();

    @FXML
    private JFXListView<String> Recette = new JFXListView<>();

    private ArrayList<Ingredient> RecIng = new ArrayList<>();

    @FXML
    private JFXTextField Libelle;

    @FXML
    private JFXTextField Prix;

    @FXML
    private JFXTextArea Description;

    private int xGrid = 0;
    private int yGrid = 0;
    private int pos = 0;
    private ImageView imgTemp = new ImageView();
    private boolean flagMenu = true;
    private String itemp;
    private Map<String, Ingredient> hashTemp = Init_produits.getHashmap();


    /**
     * A l'initialisation, on récupère tous les ingredients de Init_produits pour les mettre dans la liste des ingrédients
     *
     * @param location
     * @param resources
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for (int i = 1; i <= Init_produits.nbIngredients; i++) {
            itemp = "i" + i;
            String libelleTemp = hashTemp.get(itemp).getLibelle();
            ListeIngredients.getItems().add(libelleTemp);
        }
    }

    /**
     * Lorsque l'on rajoute un ingrédient à la recette du burger, on l'ajoute également dans RecIng qui contient des ingredients pour passer RecIng plus tard dans Init_produits.createBurger
     */
    @FXML
    void addIngredient() {
        String str = ListeIngredients.getSelectionModel().getSelectedItem();
        Recette.getItems().add(str);
        Ingredient ingTemp = new Ingredient(str);
        RecIng.add(ingTemp);
    }

    @FXML
    void addBurger() throws Exception {
        Init_produits.createBurger(RecIng, this.Libelle.getText(), Double.parseDouble(this.Prix.getText()), this.Description.getText());
        changePage("menu_principal_manager");
    }

    /**
     * Méthode simple qui vérifie uniquement deux comptes car on a pas de base de données alors on fait à la bonne franquette.
     * @param event
     * @throws Exception
     */
    @FXML
    void makeLogin(ActionEvent event) throws Exception {
        String username = user.getText();
        String password = pass.getText();
        if (username.equals("test") && password.equals("test")) {
            changePage("menu_principal_+encemoment");
        }
        if (username.equals("manager") && password.equals("manager")) {
            changePage("menu_principal_manager");
        } else {
            JOptionPane.showMessageDialog(null, "Mauvais identifiant/mot de passe", "#LaNullité", JOptionPane.ERROR_MESSAGE);
        }
    }

    @FXML
    public void toMenus() throws Exception {
        changePage("menu_principal_+encemoment");
    }

    @FXML
    public void toMenuManager() throws Exception {
        changePage("menu_principal_manager");
    }


    @FXML
    public void toAccueil() throws Exception {
        changePage("AccueilBQ");
    }

    @FXML
    public void toSubscribe() throws Exception {
        changePage("infos_perso");
    }

    @FXML
    public void toPref() throws Exception {
        changePage("Préférences");
    }

    @FXML
    public void toLogin() throws Exception {
        changePage("Login_bq");
    }

    @FXML
    public void toCommande() throws Exception {
        changePage("Main_menu_commande");
    }

    @FXML
    public void toBoissons() throws Exception {
        changePage("Boissons");
    }

    @FXML
    public void toApascher() throws Exception {
        changePage("Apascher");
    }

    @FXML
    public void toBurgers() throws Exception {
        changePage("Burgers");
    }

    @FXML
    public void toAddBurgers() throws Exception {
        changePage("AddBurgers");
    }


    @FXML
    public void toDesserts() throws Exception {
        changePage("Desserts");
    }

    @FXML
    public void toAccompagnements() throws Exception {
        changePage("Accompagnements");
    }

    @FXML
    public void toMenuBurgers() throws Exception {
        changePage("MENU_Burger");
    }

    @FXML
    public void toMenuAccompagnements() throws Exception {
        changePage("MENU_Accompagnements");
    }

    @FXML
    public void toMenuBoissons() throws Exception {
        changePage("MENU_Boissons");
    }

    @FXML
    public void toMenuDesserts() throws Exception {
        changePage("MENU_Desserts");
    }

    @FXML
    public void changePage(String unePage) throws Exception {
        String pageLoaded = "../Views/".concat(unePage).concat(".fxml");
        historique[lastHistorique] = unePage;
        lastHistorique++;

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        pageLoaded
                )
        );
        Parent root = loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }

    @FXML
    public void previousPage() throws Exception {
        lastHistorique -= 2; // Sachant que lastHistorique stocke la prochaine page sur laquelle on va, lastHistorique-1 est notre page actuelle et lastHistorique-2 la page précédente
        String pageToLoad = historique[lastHistorique];
        changePage(pageToLoad);
    }

    /**
     * On récupère le fx:id de l'image fxml cliquée qui correspond logiquement à l'id du produit dans le programme. Avant de l'ajouter au panier, on vérifie qu'on ne clique pas dans le vide/sur le grid/que
     * le fx:id est bien renseigné.
     * @param evt
     */
    @FXML
    public void addToList(MouseEvent evt) {
        try {
            String idtemp = evt.getPickResult().getIntersectedNode().getId();
            if (idtemp != gridBurgers.getId() && idtemp != null) {
                MaCommandeController.addToCart(idtemp);
            }

        } catch (Exception e1) {
            System.out.println("Vous avez cliqué dans le vide !");
        }
    }

    /**
     * Ces 3 lignes permettent de passer une instance du Controller à un enfant
     */
    private static Controller instance;

    public Controller() {
        instance = this;
    }

    public static Controller getInstance() {
        return instance;
    }

    /**
     * Au niveau algo : si la page actuelle (lastHistorique-1) contient "MENU" le produit s'ajoute normalement à la liste puis le booléen flagMenu passe en false pour éviter de pouvoir
     * recommander un produit du même type.
     * Si on ne commande pas de menu, le produit s'ajoute normalement à la liste.
     * Si on commande un menu ET que le booléen est passé en false, un msg d'erreur s'affiche.
     * On attrape l'exception lorsque String idtemp est null pour dire que l'on a cliqué dans le vide.
     * @param idtemp
     */
    @FXML
    public void addToListe(String idtemp) {
        try {
            if (historique[lastHistorique - 1].contains("MENU") && flagMenu) {
                MaCommandeController.addToCart(idtemp);
                flagMenu = false;
            } else if (historique[lastHistorique - 1].contains("MENU") != true) {
                MaCommandeController.addToCart(idtemp);
            } else if (historique[lastHistorique - 1].contains("MENU") && flagMenu == false) {
                JOptionPane.showMessageDialog(null, "T'as cru tu pouvais prendre 3 burgers dans un menu FDP ?", "JSUIS PAS TA PUTE", JOptionPane.INFORMATION_MESSAGE);
            }
        } catch (Exception e1) {
            System.out.println("Vous avez cliqué dans le vide !");
        }
    }



}