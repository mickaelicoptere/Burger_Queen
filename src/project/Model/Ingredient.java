package project.Model;


import java.util.Arrays;

public class Ingredient {
	private boolean presenceStock;
	private String libelle;
	private Allergene[] allergene = {};

	public Ingredient(String libelle) {
		this.libelle = libelle;
	}

    public boolean isPresenceStock() {
        return presenceStock;
    }

    public void setPresenceStock(boolean presenceStock) {
        this.presenceStock = presenceStock;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }


    public String toString() {
        return "Ingredient{" +
                "presenceStock=" + presenceStock +
                ", libelle='" + libelle + '\'' +
                ", allergene=" + Arrays.toString(allergene) +
                '}';
    }

    public void addAllergene (Allergene newAllergene) {
        int i = 0;
        while ((i < allergene.length) && (allergene[i] == null)) {
            i ++;
        }
        if (allergene[i] == null) {
            allergene[i] = newAllergene;
        }
    }
    
    public void delAllerge (Allergene pastAllergene) {
        int i = 0;
        while ((i < allergene.length) && (allergene[i] != pastAllergene)) {
            i++;
            if (allergene[i].equals(pastAllergene)) {
                allergene[i] = null;
                for (int j=i; j < allergene.length; j++) {
                    allergene[j] = allergene[j+1];
                }
            }
        }
    }

    public String listAllergene () {
	    return Arrays.toString(allergene);
    }
}