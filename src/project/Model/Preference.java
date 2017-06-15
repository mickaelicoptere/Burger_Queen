package project.Model;

import java.util.Vector;

public class Preference {
	private String sauce;

    public Preference(String sauce) {
        this.sauce = sauce;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }


    public String toString() {
        return "Preference{" + this + " " +
                "sauce='" + sauce + '\'' +
                '}';
    }
}
