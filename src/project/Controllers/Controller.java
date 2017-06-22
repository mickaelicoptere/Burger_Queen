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
    private GridPane gridBurgers = new GridPane();

    @FXML
    private JFXScrollPane scrollPane = new JFXScrollPane();

    private int xGrid = 0;
    private int yGrid = 0;
    private int pos = 0;
    private int incProduit = 1;
    private ImageView imgTemp = new ImageView();



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            initGrid();
        } catch (Exception e) {
            e.printStackTrace();
        }
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
        changePage("AccueilBQ.fxml");
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
                System.out.println(idtemp);
                MaCommandeController.addToCart(idtemp);
            }

        } catch (Exception e1) {
            System.out.println("Vous avez cliqué dans le vide !");
        }
    }

    @FXML
    public void addToGrid(int x, int y) {
        HBox imgRegion = new HBox();
        Image img = new Image(Controller.class.getResourceAsStream("../img/Burgers/pp1.png"));
        ImageView imgView = new ImageView();
        imgView.setImage(img);
        imgRegion.getChildren().add(imgView);
        gridBurgers.add(imgRegion, 0, 0);
    }

    @FXML
    public void initGrid() throws Exception {
        Method method = gridBurgers.getClass().getDeclaredMethod("getNumberOfRows");
        method.setAccessible(true);
        Integer rows = (Integer) method.invoke(gridBurgers);
        pos = rows;
        if (Init_produits.nbBurgers / 2 > rows) {
            int delta = Init_produits.nbBurgers / 2 - rows;
            for (int i = 0; i < delta; i++) {
                gridBurgers.addRow(pos);
                pos++;
            }
        }

        for (int i = 1; i <= Init_produits.nbBurgers; i++) {
            HBox imgRegion = new HBox();

            String idtemp = "pp" + i;
            String typetemp = "Burgers";
            String chemintemp = "../img/" + typetemp + "/" + idtemp + ".png";
            imgTemp = Init_produits.items.get(idtemp).getImg(chemintemp);
            imgTemp.setId(idtemp);


            imgRegion.getChildren().add(imgTemp);
            imgRegion.setAlignment(Pos.CENTER);
            imgRegion.setId(idtemp);
            gridBurgers.add(imgRegion, yGrid, xGrid);

            if (i < Init_produits.nbBurgers) {
                HBox imgRegion2 = new HBox();
                i++;
                idtemp = "pp" + i;
                chemintemp = "../img/" + typetemp + "/" + idtemp + ".png";
                imgTemp = Init_produits.items.get(idtemp).getImg(chemintemp);
                imgRegion2.getChildren().add(imgTemp);
                if (i == Init_produits.nbBurgers) {
                    xGrid++;
                }
                imgRegion.setAlignment(Pos.CENTER);
                imgTemp.setId(idtemp);
                gridBurgers.add(imgRegion2, yGrid + 1, xGrid);
            }

            xGrid++;

        }
        scrollPane.setContent(gridBurgers);
        JFXScrollPane.smoothScrolling((ScrollPane) scrollPane.getChildren().get(0));


    }




}