package application;

public class Employe extends Utilisateur  {
	   protected int id_employe;
	   protected String specialite;
	   
		public Employe(int id_Utilisateur, String nom_Utilisateur, String prenom_Utilisateur, String adresse_Utilisateur,
				String dateDeNaissance_Utilisateur, String tele_Utilisateur, String email_Utilisateur,
				String motDePasse_Utilisateur, String sexe_Utilisateur, int id_employe , String specialite) {
			super(id_Utilisateur, nom_Utilisateur, prenom_Utilisateur, adresse_Utilisateur, dateDeNaissance_Utilisateur,
					tele_Utilisateur, email_Utilisateur, motDePasse_Utilisateur, sexe_Utilisateur);
		    this.id_employe=id_employe;
		    this.specialite=specialite;
		}

		public int getId_Employe() {
			return id_employe;
		}

		public void setId_Employe(int id_Employe) {
			this.id_employe = id_Employe;
		}

		public String getSpecialite() {
			return specialite;
		}

		public void setSpecialite(String specialite) {
			this.specialite = specialite;
		}
		

	}