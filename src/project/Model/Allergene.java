package project.Model;

import java.util.Vector;

public class Allergene {
	private String _libelle;
	public Vector<Ingredient> _unnamed_Ingredient_ = new Vector<Ingredient>();

	public String getLibelle() {
		return this._libelle;
	}

	public void setLibelle(String aLibelle) {
		this._libelle = aLibelle;
	}
}