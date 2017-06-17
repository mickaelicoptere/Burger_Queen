package project.Model;

public class Accompagnement extends Item {
    private String taille;


    public Accompagnement(String libelle, double prix, String taille) {
        super(libelle, prix);
        this.taille = taille;
    }

    public String getTaille() {
        return this.taille;
    }

    public void setTaille(String Taille) {
        this.taille = Taille;
    }

    public String toString() {
        return "Accompagnement " + this + "\n" +
                "Taille='" + taille + '\''
                ;
    }
}