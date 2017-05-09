package project.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import project.Main;


public class Controller {

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