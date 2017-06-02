import java.util.Vector;

public class Commande {
	private double _prixCommande;
	private int _numero;
	private boolean _aEmporter;
	public Utilisateur _unnamed_Utilisateur_;
	public Vector<Item> _unnamed_Item_ = new Vector<Item>();

	public double getPrixCommande() {
		return this._prixCommande;
	}

	public void setPrixCommande(double aPrixCommande) {
		this._prixCommande = aPrixCommande;
	}

	public int getNumero() {
		return this._numero;
	}

	public void setNumero(int aNumero) {
		this._numero = aNumero;
	}

	public boolean getAEmporter() {
		return this._aEmporter;
	}

	public void setAEmporter(boolean aAEmporter) {
		this._aEmporter = aAEmporter;
	}

	public void addItem() {
		throw new UnsupportedOperationException();
	}

	public void deleteItem() {
		throw new UnsupportedOperationException();
	}

	public double calcPrix() {
		throw new UnsupportedOperationException();
	}
}