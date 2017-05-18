package project.Model;

public class Allergene {
	private String libelle;

	public Allergene () { this.libelle = null; }
	public Allergene (String libelle) { this.libelle = libelle; }

	public String getLibelle() {
		return this.libelle;
	}

	public void setLibelle(String aLibelle) {
		libelle = aLibelle;
	}
}