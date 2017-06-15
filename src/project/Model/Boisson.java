package project.Model;


public class Boisson extends Item {
    private Taille taille;

    public Boisson(Taille taille, String libelle, double prix) {
        super(libelle, prix);
        this.taille = taille;
    }

    public Taille getTaille() {
        return this.taille;
    }

    public void setTaille(Taille taille) {
        this.taille = taille;
    }

}