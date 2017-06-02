package project.Model;

import project.Classes.Item;

import java.util.Vector;

public class Produit_principal extends Item {
	private String description;

    public Produit_principal(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }


    public String toString() {
        return "Produit_principal{" + this + " " +
                "description='" + description + '\'' +
                '}';
    }
}