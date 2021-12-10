package application;

public class Respo_Client {
private int id_respoClient;
private int Num_contrat;


public Respo_Client(int id_respoClient, int num_contrat) {
	super();
	this.id_respoClient = id_respoClient;
	Num_contrat = num_contrat;
}
public int getId_respoClient() {
	return id_respoClient;
}
public void setId_respoClient(int id_respoClient) {
	this.id_respoClient = id_respoClient;
}
public int getNum_contrat() {
	return Num_contrat;
}
public void setNum_contrat(int num_contrat) {
	Num_contrat = num_contrat;
}

}