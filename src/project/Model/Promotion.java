import java.util.Vector;

public class Promotion {
	private date _dateDebut;
	private date _dateFin;
	private String _condition;
	public Vector<Item> _unnamed_Item_ = new Vector<Item>();

	public date getDateDebut() {
		return this._dateDebut;
	}

	public void setDateDebut(date aDateDebut) {
		this._dateDebut = aDateDebut;
	}

	public date getDateFin() {
		return this._dateFin;
	}

	public void setDateFin(date aDateFin) {
		this._dateFin = aDateFin;
	}

	public String getCondition() {
		return this._condition;
	}

	public void setCondition(String aCondition) {
		this._condition = aCondition;
	}

	public Promotion getListe(Object aString_condition) {
		throw new UnsupportedOperationException();
	}
}