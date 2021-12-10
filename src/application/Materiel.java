package application;

public class Materiel {
private int id_Materiel;
private String libelle;
private String type_Materiel;
private String Description;
private String nom_materiel;
private int prix;
private int quantite;
private enum etat {actif , nonActif};


public Materiel(int id_Materiel, String libelle, String type_Materiel, String description, String nom_materiel,
		int prix, int quantite, String date_achat) {
	
	this.id_Materiel = id_Materiel;
	this.libelle = libelle;
	this.type_Materiel = type_Materiel;
	Description = description;
	this.nom_materiel = nom_materiel;
	this.prix = prix;
	this.quantite = quantite;
	this.date_achat = date_achat;
}
private String date_achat;
public int getId_Materiel() {
	return id_Materiel;
}
public void setId_Materiel(int id_Materiel) {
	this.id_Materiel = id_Materiel;
}
public String getLibelle() {
	return libelle;
}
public void setLibelle(String libelle) {
	this.libelle = libelle;
}
public String getType_Materiel() {
	return type_Materiel;
}
public void setType_Materiel(String type_Materiel) {
	this.type_Materiel = type_Materiel;
}
public String getDescription() {
	return Description;
}
public void setDescription(String description) {
	Description = description;
}
public String getNom_materiel() {
	return nom_materiel;
}
public void setNom_materiel(String nom_materiel) {
	this.nom_materiel = nom_materiel;
}
public int getPrix() {
	return prix;
}
public void setPrix(int prix) {
	this.prix = prix;
}
public int getQuantite() {
	return quantite;
}
public void setQuantite(int quantite) {
	this.quantite = quantite;
}
public String getDate_achat() {
	return date_achat;
}
public void setDate_achat(String date_achat) {
	this.date_achat = date_achat;
}
@Override
public String toString() {
	return "Materiel [id_Materiel=" + id_Materiel + ", libelle=" + libelle + ", type_Materiel=" + type_Materiel
			+ ", Description=" + Description + ", nom_materiel=" + nom_materiel + ", prix=" + prix + ", quantite="
			+ quantite + ", date_achat=" + date_achat + "]";
}
}