package project.Model;

public class Allergene {
	private String description;

	public Allergene(String libelle) { this.description = libelle; }

	public String getLibelle() {
		return this.description;
	}

	public void setLibelle(String Libelle) {
		description = Libelle;
	}
}