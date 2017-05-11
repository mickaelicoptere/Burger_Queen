package project.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import project.Main;

import java.lang.String;

import com.jfoenix.controls.*;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;

import java.awt.event.ActionEvent;
import java.net.URL;
import java.util.ResourceBundle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class Controller implements Initializable {

    @FXML
    private JFXButton connexion;

    @FXML
    public JFXTextField user;

    @FXML
    public JFXPasswordField pass;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    @FXML
    void MakeLogin(ActionEvent event) throws Exception {
        String username = user.getText();
        String password = pass.getText();
        if (username.equals("test") && password.equals("test")) {
            toMenus();
        } else {
            System.out.println("Mauvais identifiants");
        }
    }

    public void toMenus() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/menu_principal_+encemoment.fxml"
                )
        );

        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }

    public void toAccueil() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/AccueilBQ.fxml"
                )
        );
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }

    public void toSubscribe() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/Inscription.fxml"
                )
        );
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }

    public void toLogin() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/Login_bq.fxml"
                )
        );
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }

    public void toCommande() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/Main_menu_commande.fxml"
                )
        );
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }
}