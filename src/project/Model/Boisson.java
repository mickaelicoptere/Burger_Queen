package project.Model;


public class Boisson extends Item {
    private String taille;

    public Boisson(Taille taille, String libelle, double prix) {
        super(libelle, prix);
        this.taille = taille;
    }

    public String getTaille() {
        return this.taille;
    }

    public void setTaille(String Taille) {
        this.taille = Taille;
    }

//	}
}