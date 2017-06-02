import java.util.Vector;

public class Accompagnement extends Item {
	private String _taille;
	public Vector<Menu> _unnamed_Menu_ = new Vector<Menu>();
	public Vector<Ingredient> _unnamed_Ingredient_ = new Vector<Ingredient>();

	public String getTaille() {
		return this._taille;
	}

	public void setTaille(String aTaille) {
		this._taille = aTaille;
	}
}