package application;

public class Utilisateur {
	 protected int id_Utilisateur;
	 protected String nom_Utilisateur;
	 protected String prenom_Utilisateur;
	 protected String adresse_Utilisateur;
	 protected String dateDeNaissance_Utilisateur;
	 protected String tele_Utilisateur;
	 protected String email_Utilisateur;
	 protected String motDePasse_Utilisateur;
	 protected String sexe_Utilisateur;
	 protected enum type{Admin ,Respo_Client,Respo_Materiel,Respo_Paiement };
	 protected enum status { actif,Noactif};
	 

	 public Utilisateur(int id_Utilisateur, String nom_Utilisateur, String prenom_Utilisateur, String adresse_Utilisateur,
			String dateDeNaissance_Utilisateur, String tele_Utilisateur, String email_Utilisateur,
			String motDePasse_Utilisateur, String sexe_Utilisateur) {
		super();
		this.id_Utilisateur = id_Utilisateur;
		this.nom_Utilisateur = nom_Utilisateur;
		this.prenom_Utilisateur = prenom_Utilisateur;
		this.adresse_Utilisateur = adresse_Utilisateur;
		this.dateDeNaissance_Utilisateur = dateDeNaissance_Utilisateur;
		this.tele_Utilisateur = tele_Utilisateur;
		this.email_Utilisateur = email_Utilisateur;
		this.motDePasse_Utilisateur = motDePasse_Utilisateur;
		this.sexe_Utilisateur = sexe_Utilisateur;
	}
	public String getAdresse_Utilisateur() {
		return adresse_Utilisateur;
	}
	 public String getDateDeNaissance_Utilisateur() {
		return dateDeNaissance_Utilisateur;
	}
	 public String getEmail_Utilisateur() {
		return email_Utilisateur;
	}
	 public int getId_Utilisateur() {
		return id_Utilisateur;
	}
	 public String getMotDePasse_Utilisateur() {
		return motDePasse_Utilisateur;
	}
	 public String getNom_Utilisateur() {
		return nom_Utilisateur;
	}
	 public String getPrenom_Utilisateur() {
		return prenom_Utilisateur;
	}
	 public String getSexe_Utilisateur() {
		return sexe_Utilisateur;
	}
	 public String getTele_Utilisateur() {
		return tele_Utilisateur;
	}
	 public void setAdresse_Utilisateur(String adresse_Utilisateur) {
		this.adresse_Utilisateur = adresse_Utilisateur;
	}
	 public void setDateDeNaissance_Utilisateur(String dateDeNaissance_Utilisateur) {
		this.dateDeNaissance_Utilisateur = dateDeNaissance_Utilisateur;
	}
	 public void setEmail_Utilisateur(String email_Utilisateur) {
		this.email_Utilisateur = email_Utilisateur;
	}
	 public void setId_Utilisateur(int id_Utilisateur) {
		this.id_Utilisateur = id_Utilisateur;
	}
	 public void setMotDePasse_Utilisateur(String motDePasse_Utilisateur) {
		this.motDePasse_Utilisateur = motDePasse_Utilisateur;
	}
	 public void setNom_Utilisateur(String nom_Utilisateur) {
		this.nom_Utilisateur = nom_Utilisateur;
	}
	 public void setPrenom_Utilisateur(String prenom_Utilisateur) {
		this.prenom_Utilisateur = prenom_Utilisateur;
	}
	 public void setSexe_Utilisateur(String sexe_Utilisateur) {
		this.sexe_Utilisateur = sexe_Utilisateur;
	}
	 public void setTele_Utilisateur(String tele_Utilisateur) {
		this.tele_Utilisateur = tele_Utilisateur;
	}
	@Override
	public String toString() {
		return "Utilisateur [id_Utilisateur=" + id_Utilisateur + ", nom_Utilisateur=" + nom_Utilisateur
				+ ", prenom_Utilisateur=" + prenom_Utilisateur + ", adresse_Utilisateur=" + adresse_Utilisateur
				+ ", dateDeNaissance_Utilisateur=" + dateDeNaissance_Utilisateur + ", tele_Utilisateur=" + tele_Utilisateur
				+ ", email_Utilisateur=" + email_Utilisateur + ", motDePasse_Utilisateur=" + motDePasse_Utilisateur
				+ ", sexe_Utilisateur=" + sexe_Utilisateur + "]";
	}
	 
	 
	}
