import java.util.Vector;

public class Boisson extends Item {
	private String _taille;
	public Vector<Menu> _unnamed_Menu_ = new Vector<Menu>();

	public String getTaille() {
		return this._taille;
	}

	public void setTaille(String aTaille) {
		this._taille = aTaille;
	}
}