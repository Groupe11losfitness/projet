package application;

public class Respo_Paiement {
	private int id_respoPaiement;
	private int Num_contrat;


	public Respo_Paiement(int id_respoClient, int num_contrat) {
		super();
		this.id_respoPaiement = id_respoClient;
		Num_contrat = num_contrat;
	}
	public int getId_respoClient() {
		return id_respoPaiement;
	}
	public void setId_respoClient(int id_respoClient) {
		this.id_respoPaiement = id_respoClient;
	}
	public int getNum_contrat() {
		return Num_contrat;
	}
	public void setNum_contrat(int num_contrat) {
		Num_contrat = num_contrat;
	}

	
}
