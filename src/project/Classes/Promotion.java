package project.Classes;

import java.util.Date;
import java.util.Vector;

public class Promotion {
    private Date _dateDebut;
    private Date _dateFin;
    private String _condition;
    public Vector<Item> _unnamed_Item_ = new Vector<>();

    public Date getDateDebut() {
        return this._dateDebut;
    }

    public void setDateDebut(Date aDateDebut) {
        this._dateDebut = aDateDebut;
    }

    public Date getDateFin() {
        return this._dateFin;
    }

    public void setDateFin(Date aDateFin) {
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