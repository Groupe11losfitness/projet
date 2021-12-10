package application;

public class Paiement {
	
private int id_Paiement;
private int montant;
private String Date_Paiement;
private String mode_Paiement;

public Paiement(int id_Paiement, int montant, String date_Paiment, String mode_Paiement) {
	super();
	this.id_Paiement = id_Paiement;
	this.montant = montant;
	Date_Paiement = date_Paiment;
	this.mode_Paiement = mode_Paiement;
}



public int getId_Paiement() {
	return id_Paiement;
}



public void setId_Paiement(int id_Paiement) {
	this.id_Paiement = id_Paiement;
}



public int getMontant() {
	return montant;
}



public void setMontant(int montant) {
	this.montant = montant;
}



public String getDate_Paiement() {
	return Date_Paiement;
}



public void setDate_Paiement(String date_Paiment) {
	Date_Paiement = date_Paiment;
}


public String getMode_Paiement() {
	return mode_Paiement;
}



public void setMode_Paiement(String mode_Paiement) {
	this.mode_Paiement = mode_Paiement;
}



@Override
public String toString() {
	return "Paiement [id_Paiement=" + id_Paiement + ", montant=" + montant + ", Date_Paiment=" + Date_Paiement
			+ ", mode_Paiement=" + mode_Paiement + "]";
}

	
}