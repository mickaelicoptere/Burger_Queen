package project.Controllers;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import project.Init_produits;
import project.Model.Item;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by Virgile on 15/06/2017.
 * TU VOLES TU PAIES
 */
public class ListeCommandeController implements Initializable {

    @FXML
    private JFXListView<String> ListeCommande = new JFXListView<>();
    @FXML
    private JFXTextField TotalCommande = new JFXTextField();
    private Item itTemp;
    private int i = Init_produits.c1.nbItem;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        if (i != 0) {
            for (int j = 0; j < i; j++) {
                ListeCommande.getItems().add(Init_produits.c1.getNameById(j));
                System.out.println("Un element added");
            }
        }

        TotalCommande.setText(calculTotal());
        System.out.println(Init_produits.c1.calcPrixCommande());
    }

    @FXML
    void addToCart(String idtemp) throws Exception {
        System.out.println("Button clicked");

        Init_produits.c1.addItem(idtemp);
        itTemp = Init_produits.c1.getItem(idtemp);
        System.out.println("Ajout au tableau de : " + itTemp.getLibelle());
        ListeCommande.getItems().add(itTemp.getLibelle());
        TotalCommande.setText(calculTotal());
        System.out.println(Init_produits.c1.calcPrixCommande());
    }

    String calculTotal() {
        return "Prix total : " + String.valueOf(Init_produits.c1.calcPrixCommande()) + "€";
    }
}
