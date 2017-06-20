package project.Controllers;

import com.jfoenix.controls.JFXListView;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import project.Init_produits;
import project.Model.Item;

import java.io.BufferedWriter;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.ResourceBundle;

//import java.awt.event.ActionEvent;


/**
 * Created by Virgile on 15/06/2017.
 * TU VOLES TU PAIES
 */
public class ListeCommandeController implements Initializable {


    @FXML
    public JFXListView<String> ListeCommande = new JFXListView<>();
    @FXML
    protected JFXTextField TotalCommande = new JFXTextField();
    protected Item itTemp;
    protected int i = Init_produits.c1.nbItem;
    private Map<String, String> correspondanceNom = new HashMap<>();

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

    public void saveCommande(ActionEvent event) throws Exception {
        Random rnd = new Random();
        int index = rnd.nextInt();

        Path path = Paths.get("InfoCommandes.txt");
        try (BufferedWriter writer = Files.newBufferedWriter(path)) {
            writer.write("Commande n° : #" + index + "\n");
            writer.write(Init_produits.c1.listCommande());
            writer.write(calculTotal());
        }
    }

    @FXML //TODO La méthode fonctionne, c'est seulement l'affichage qui merde
    public void delItemSelected() {
        String toDel = ListeCommande.getSelectionModel().getSelectedItem();
        System.out.println("TODEL" + toDel);
        Init_produits.c1.delItemName(toDel);
        ListeCommande.getItems().remove(itTemp.getLibelle());
    }
}
