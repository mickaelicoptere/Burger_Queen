package project.Model;

import java.util.*;

public class Promotion {
	private Date dateDebut;
	private Date dateFin;
	private String condition;


	public Date getDateDebut() {
		return this.dateDebut;
	}

	public void setDateDebut(Date DateDebut) {
		this.dateDebut = DateDebut;
	}

	public Date getDateFin() {
		return this.dateFin;
	}

	public void setDateFin(Date DateFin) {
		this.dateFin = DateFin;
	}

	public String getCondition() {
		return this.condition;
	}

	public void setCondition(String Condition) {
		this.condition = Condition;
	}

	public Promotion getListe(Object String_condition) {
		throw new UnsupportedOperationException();
	}
}