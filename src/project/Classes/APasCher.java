package project.Classes;

import java.util.Vector;

public class APasCher extends Item {
    private String _description;
    public Vector<Ingredient> _unnamed_Ingredient_ = new Vector<>();

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String aDescription) {
        this._description = aDescription;
    }
}