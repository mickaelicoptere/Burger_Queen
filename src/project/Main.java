package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import project.Model.Utilisateur;

import java.util.logging.Level;
import java.util.logging.Logger;


public class Main extends Application {

    public static Stage primaryStage;


    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        try {
            Init_produits.main();
            AnchorPane page = FXMLLoader.load(Main.class.getResource("../project/Views/AccueilBQ.fxml"));
            Scene scene = new Scene(page);
            stage.setScene(scene);
            stage.setTitle("Bienvenue chez Burger Queen !");
            stage.show();
            primaryStage = stage;

        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

        project.Model.Utilisateur user1 = new Utilisateur("Sopalin", "john", "john.sopalin@wesh.com", "6696969", "1234", true);
    }

}