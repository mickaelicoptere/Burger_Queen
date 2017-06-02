package project.Classes;

import java.util.Vector;

public class Produit_principal extends Item {
    private String _description;
    public Vector<Menu> _unnamed_Menu_ = new Vector<>();
    public Vector<Composition> _unnamed_Composition_ = new Vector<>();

    public String getDescription() {
        return this._description;
    }

    public void setDescription(String aDescription) {
        this._description = aDescription;
    }
}