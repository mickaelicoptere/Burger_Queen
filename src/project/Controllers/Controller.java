package project.Controllers;

import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import project.Main;


public class Controller {

    public void handleButtonClick() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/Menu_principal.fxml"
                )
        );

        Parent root = (Parent) loader.load();

        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }


    public void toMenus() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/menus.fxml"
                )
        );

        Parent root = (Parent) loader.load();

        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }


    public void previousPage() throws Exception {
        FXMLLoader loader = new FXMLLoader(
                getClass().getResource(
                        "../Views/menus.fxml"
                )
        );

        Parent root = (Parent) loader.load();

        Scene scene = new Scene(root);
        Main.primaryStage.setScene(scene);
    }


}
