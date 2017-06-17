package project.Model;

public class Utilisateur {
	private String nom;
	private String prenom;
	private String mail;
	private String tel;
	private String mdp;
	private boolean ice;
	private Preference Sauce;


	public Utilisateur(String nom, String prenom, String mail, String tel, String mdp, boolean ice) {
		this.nom = nom;
		this.prenom = prenom;
		this.mail = mail;
		this.tel = tel;
		this.mdp = mdp;
		this.ice = ice;
	}

	public static String toString(String nom, String prenom, String mail, String tel, String mdp, boolean ice) {
		return
				"Utilisateur : " + "\n" +
						"Nom : " + nom + "\n" +
						"Prenom : " + prenom + "\n" +
						"Mail : " + mail + "\n" +
						"Tel : " + tel + "\n" +
						"Mot de Passe : *************\n" +
						"Glace : " + ice;
	}

	public String getNom() {
		return this.nom;
	}

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return this.prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getMail() {
        return this.mail;
    }

	public void setMail(String aMail) { this.mail = aMail; }

	public String getTel() {
		return this.tel;
	}

	public void setTel(String aTel) {
		this.tel = aTel;
	}

	public String getMdp() {
		return this.mdp;
	}

	public void setMdp(String Mdp) {
		this.mdp = Mdp;
	}

	public boolean getIce() {
		return this.ice;
	}

	public void setIce(boolean Ice) {
		this.ice = Ice;
	}

	public Preference getSauce() {
		return Sauce;
	}

	public void setSauce(Preference sauce) {
		this.Sauce = sauce;
	}

	public void changeMdp(String newMdp) {
		this.mdp = newMdp;
	}

	public void changeMail(String newMail) {
		this.mail = newMail;
	}

	public void changeTel(String newTel) {
		this.tel = newTel;
	}

}