package project.Controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import project.Model.Utilisateur;

import java.io.BufferedWriter;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ResourceBundle;

/**
 * Created by shuwn on 12/06/2017.
 */
public class User extends Controller implements Initializable {

    public String nomUser = new String();
    public String prenomUser = new String();
    public String mailUser = new String();
    public String telUser = new String();
    public String mdpUser = new String();
    public String LoginUser = new String();
    private boolean inscription = false;

    @FXML
    private JFXTextField Login;
    @FXML
    private JFXPasswordField Password1;
    @FXML
    private JFXPasswordField Password2;
    @FXML
    private JFXTextField Nom;
    @FXML
    private JFXTextField Prenom;
    @FXML
    private JFXTextField Email1;
    @FXML
    private JFXTextField Ntel1;
    @FXML
    private JFXTextField Ntel2;
    @FXML
    private JFXTextField Email2;


    public User() throws IOException {

    }


    @FXML
    public void toSaveCreds(ActionEvent event) throws Exception {
        inscription = true; // always true

        String nomUser = this.Nom.getText();
        String prenomUser = this.Prenom.getText();
        String mailUser = this.Email1.getText();
        String telUser = this.Ntel1.getText();
        String mdpUser = this.Password1.getText();
        String LoginUser = this.Login.getText();

        if (inscription == true) {
            //Utilisateur u1 = new Utilisateur(this.Nom.getAccessibleText(),this.Prenom.getAccessibleText() this.Email1.getAccessibleText(), this.Ntel1.getAccessibleText(), this.Password1.getAccessibleText(),true);

            Utilisateur u1 = new Utilisateur(nomUser, prenomUser, mailUser, 22, mdpUser, true);
            System.out.println("Utilisateur enregistré :" + "\nNom : " + nomUser + "\nPrénom : " + prenomUser + "\nMail : " + mailUser + "\nNtel : " + telUser + "\nmdpUser : " + mdpUser);
            toPref();

            Path path = Paths.get("Userinfo.txt");
            try (BufferedWriter writer = Files.newBufferedWriter(path)) {
                writer.write("Utilisateur enregistré :" + "\nNom : " + nomUser + "\nPrénom : " + prenomUser + "\nMail : " + mailUser + "\nNtel : " + telUser + "\nmdpUser : " + mdpUser);
            }

        }
        //TODO écrire dans un fichier les infos user
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
