package project.Classes;

import java.awt.Menu;
import java.util.Vector;

public class Accompagnement extends Item {
    private String _taille;
    public Vector<java.awt.Menu> _unnamed_Menu_ = new Vector<>();
    public Vector<Ingredient> _unnamed_Ingredient_ = new Vector<>();

    public String getTaille() {
        return this._taille;
    }

    public void setTaille(String aTaille) {
        this._taille = aTaille;
    }
}