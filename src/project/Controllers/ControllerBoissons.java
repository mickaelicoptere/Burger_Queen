package project.Controllers;

import com.jfoenix.controls.JFXScrollPane;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Pos;
import javafx.scene.control.Control;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import project.Init_produits;
import project.Controllers.*;


import java.lang.reflect.Method;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Virgile on 22/06/2017.
 * TU VOLES TU PAIES
 */
public class ControllerBoissons implements Initializable {

    private int xGrid = 0;
    private int yGrid = 0;
    private int pos = 0;
    private ImageView imgTemp = new ImageView();
    private String chemintemp;


    @FXML
    private GridPane gridBoissons = new GridPane();

    @FXML
    private JFXScrollPane scrollPane = new JFXScrollPane();

    private Controller main;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        try {
            initGrid();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void setMain(Controller main) {
        this.main = main;
    }


    @FXML
    public void addToList(MouseEvent evt) {
        String idtemp = evt.getPickResult().getIntersectedNode().getId();
        try {
            if (idtemp != gridBoissons.getId() && idtemp != null) {
                Controller.getInstance().addToListe(idtemp);
            }

        } catch (Exception e1) {
            System.out.println("Vous avez cliqué dans le vide !");
        }
    }

    @FXML
    public void initGrid() throws Exception {
        Method method = gridBoissons.getClass().getDeclaredMethod("getNumberOfRows");
        method.setAccessible(true);
        Integer rows = (Integer) method.invoke(gridBoissons);
        pos = rows;
        if (Init_produits.nbBoissons / 3 > rows) {
            int delta = Init_produits.nbBoissons / 3 - rows;
            for (int i = 0; i < delta; i++) {
                gridBoissons.addRow(pos);
                pos++;
            }
        }

        for (int i = 1; i <= Init_produits.nbBoissons; i++) {
            try {
                HBox imgRegion = new HBox();

                String idtemp = "b" + i;
                String typetemp = "Boissons";
                chemintemp = "../img/" + typetemp + "/" + idtemp + ".png";
                imgTemp = Init_produits.items.get(idtemp).getImg(chemintemp);
                imgTemp.setId(idtemp);


                imgRegion.getChildren().add(imgTemp);
                imgRegion.setAlignment(Pos.CENTER);
                imgRegion.setId(idtemp);
                gridBoissons.add(imgRegion, yGrid, xGrid);
                i++;

                if (i <= Init_produits.nbBoissons) {
                    HBox imgRegion2 = new HBox();
                    idtemp = "b" + i;
                    chemintemp = "../img/" + typetemp + "/" + idtemp + ".png";
                    imgTemp = Init_produits.items.get(idtemp).getImg(chemintemp);
                    imgRegion2.getChildren().add(imgTemp);
                    imgRegion2.setAlignment(Pos.CENTER);
                    imgTemp.setId(idtemp);
                    gridBoissons.add(imgRegion2, yGrid + 1, xGrid);
                }
                i++;
                if (i <= Init_produits.nbBoissons) {
                    HBox imgRegion2 = new HBox();
                    idtemp = "b" + i;
                    chemintemp = "../img/" + typetemp + "/" + idtemp + ".png";
                    imgTemp = Init_produits.items.get(idtemp).getImg(chemintemp);
                    imgRegion2.getChildren().add(imgTemp);
                    imgRegion2.setAlignment(Pos.CENTER);
                    imgTemp.setId(idtemp);
                    gridBoissons.add(imgRegion2, yGrid + 2, xGrid);
                }

                xGrid++;

            } catch (Exception e) {
                System.out.println("Pas d'image correspondante à " + chemintemp);
            }

        }
        scrollPane.setContent(gridBoissons);
        JFXScrollPane.smoothScrolling((ScrollPane) scrollPane.getChildren().get(0));
    }
}
