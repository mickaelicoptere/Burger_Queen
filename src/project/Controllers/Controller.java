package project.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.layout.AnchorPane;
import project.Main;

import java.awt.*;
import java.lang.String;

import com.jfoenix.controls.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.event.ActionEvent;


import java.net.URL;
import java.util.ResourceBundle;


import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Controller implements Initializable {

    private static String[] historique = new String[256];
    private static int lastHistorique;

    public AnchorPane Payer;
    @FXML
    private JFXButton connexion;

    @FXML
    public JFXTextField user;

    @FXML
    public JFXPasswordField pass;

    @FXML
    public AnchorPane MainAnchor;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void makeLogin(ActionEvent event) throws Exception {
        String username = user.getText();
        String password = pass.getText();
        if (username.equals("test") && password.equals("test")) {
            changePage("menu_principal_+encemoment");
        } else {
            System.out.println("Error");
        }
    }

    @FXML
    public void toMenus() throws Exception {
        changePage("menu_principal_+encemoment");
    }

    @FXML
    public void toAccueil() throws Exception {
        changePage("menu_principal_+encemoment");
    }

    @FXML
    public void toSubscribe() throws Exception {
        changePage("Inscription");
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
    private void changePage(String unePage) throws Exception {
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
    private void previousPage() throws Exception {
        int i = lastHistorique - 2;
        String pageToLoad = historique[i];
        changePage(pageToLoad);
    }
}