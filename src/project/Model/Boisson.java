package project.Model;

public class Boisson extends Item {
	private String taille;

	public Boisson() { this.taille = null; }
	public Boisson(String taille) { this.taille = taille; }

	public String getTaille() {
		return this.taille;
	}

	public void setTaille(String Taille) {
		this.taille = Taille;
	}
}