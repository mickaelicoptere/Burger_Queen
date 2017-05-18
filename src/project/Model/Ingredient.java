package project.Model;

import java.util.Vector;

public class Ingredient {
	private boolean _presenceStock;
	private String _libelle;
	public Vector<Composition> _unnamed_Composition_ = new Vector<Composition>();
	public Vector<Accompagnement> _unnamed_Accompagnement_ = new Vector<Accompagnement>();
	public Vector<APasCher> _unnamed_APasCher_ = new Vector<APasCher>();
	public Vector<Allergene> _unnamed_Allergene_ = new Vector<Allergene>();

	public boolean getPresenceStock() {
		return this._presenceStock;
	}

	public void setPresenceStock(boolean aPresenceStock) {
		this._presenceStock = aPresenceStock;
	}

	public String getLibelle() {
		return this._libelle;
	}

	public void setLibelle(String aLibelle) {
		this._libelle = aLibelle;
	}
}