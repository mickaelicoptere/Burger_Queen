package project.Controllers;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import project.Main;


public class Controller {

    public void toMenus() throws Exception {
        changePage("menu_principal_+encemoment");
    }

    public void toAccueil() throws Exception {
        changePage("menu_principal_+encemoment");
    }

    public void toSubscribe() throws Exception {
        changePage("Inscription");
    }

    public void toLogin() throws Exception {
        changePage("Login_bq");
    }

    public void toCommande() throws Exception {
        changePage("Main_menu_commande");
    }

    public void changePage(String unePage) throws Exception {
        String page = (String) unePage;
        String pageLoaded = "../Views/".concat(page).concat(".fxml");

        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        pageLoaded
                )
        );
        Parent root = (Parent) loader.load();
        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }

}