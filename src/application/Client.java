package application;

public class Client {
	 private int id_Client;
	 private String nom_Client;
	 private String prenom_Client;
	 private String adresse_Client;
	 private String dateDeNaissance_Client;
	 private String tele_Client;
	 private String email_Client;
	 private String sexe_Client;
	 
	public Client(int id_Client, String nom_Client, String prenom_Client, String adresse_Client,
			String dateDeNaissance_Client, String tele_Client, String email_Client, String sexe_Client) {
		
		this.id_Client = id_Client;
		this.nom_Client = nom_Client;
		this.prenom_Client = prenom_Client;
		this.adresse_Client = adresse_Client;
		this.dateDeNaissance_Client = dateDeNaissance_Client;
		this.tele_Client = tele_Client;
		this.email_Client = email_Client;
		this.sexe_Client = sexe_Client;
	}
	public String getPrenom_Client() {
		return prenom_Client;
	}
	public void setPrenom_Client(String prenom_Client) {
		this.prenom_Client = prenom_Client;
	}
	public String getAdresse_Client() {
		return adresse_Client;
	}
	public void setAdresse_Client(String adresse_Client) {
		this.adresse_Client = adresse_Client;
	}
	public String getDateDeNaissance_Client() {
		return dateDeNaissance_Client;
	}
	public void setDateDeNaissance_Client(String dateDeNaissance_Client) {
		this.dateDeNaissance_Client = dateDeNaissance_Client;
	}
	public String getTele_Client() {
		return tele_Client;
	}
	public void setTele_Client(String tele_Client) {
		this.tele_Client = tele_Client;
	}
	public String getEmail_Client() {
		return email_Client;
	}
	public void setEmail_Client(String email_Client) {
		this.email_Client = email_Client;
	}
	public String getSexe_Client() {
		return sexe_Client;
	}
	public void setSexe_Client(String sexe_Client) {
		this.sexe_Client = sexe_Client;
	}
	public int getId_Client() {
		return id_Client;
	}
	public void setId_Client(int id_Client) {
		this.id_Client = id_Client;
	}
	public String getNom_Client() {
		return nom_Client;
	}
	public void setNom_Client(String nom_Client) {
		this.nom_Client = nom_Client;
	}
	@Override
	public String toString() {
		return "Client [id_Client=" + id_Client + ", nom_Client=" + nom_Client + ", prenom_Client=" + prenom_Client
				+ ", adresse_Client=" + adresse_Client + ", dateDeNaissance_Client=" + dateDeNaissance_Client
				+ ", tele_Client=" + tele_Client + ", email_Client=" + email_Client + ", sexe_Client=" + sexe_Client
				+ "]";
	}

}

