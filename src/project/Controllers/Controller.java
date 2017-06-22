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
    private ControllerBurgers BurgersController;

    @FXML
    private GridPane gridBurgers = new GridPane();

    @FXML
    private JFXScrollPane scrollPane = new JFXScrollPane();

    private int xGrid = 0;
    private int yGrid = 0;
    private int pos = 0;
    private ImageView imgTemp = new ImageView();
    private boolean flagMenu = true;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
    }

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
            System.out.println("Error");
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
        lastHistorique -= 2;
        String pageToLoad = historique[lastHistorique];
        changePage(pageToLoad);
    }

    @FXML
    public void addToList(MouseEvent evt) {
        try {
            String idtemp = evt.getPickResult().getIntersectedNode().getId();
            if (idtemp != gridBurgers.getId() && idtemp != null) {
                System.out.println("On va invoke" + idtemp);
                MaCommandeController.addToCart(idtemp);
                System.out.println("C invoke");
            }

        } catch (Exception e1) {
            System.out.println("Vous avez cliqué dans le vide !");
        }
    }

    private static Controller instance;

    public Controller() {
        instance = this;
    }

    // static method to get instance of view
    public static Controller getInstance() {
        return instance;
    }

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