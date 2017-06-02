package project.Classes;

import java.util.Vector;

public class Preference {
    private String _sauce;
    public Vector<Allergene> _unnamed_Allergene_ = new Vector<>();
    public Utilisateur _unnamed_Utilisateur_;

    public String getSauce() {
        return this._sauce;
    }

    public void setSauce(String aSauce) {
        this._sauce = aSauce;
    }
}