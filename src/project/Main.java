package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
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
            AnchorPane page = FXMLLoader.load(Main.class.getResource("../project/Views/Accueil_BQ.fxml"));
            Scene scene = new Scene(page);
            stage.setScene(scene);
            stage.setTitle("Le FXML c'est de l'eau");
            stage.show();
            primaryStage = stage;
        } catch (Exception ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


}