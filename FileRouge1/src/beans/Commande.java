package beans;

public class Commande {
	private Double montantCommande;
	private String modePaiementCommande;
	private String statusPaiementCommande;
	private String modeLivraisonCommande;
	private String statusLivraisonCommande;
	private String date;
	
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	Client client;
	
	public Commande() {
		super();
	}
	public double getMontantCommande() {
		return montantCommande;
	}
	public void setMontantCommande(Double montantCommande) {
		this.montantCommande = montantCommande;
	}
	public Client getClient() {
		return client;
	}
	public void setClient(Client client) {
		this.client = client;
	}
	public String getModePaiementCommande() {
		return modePaiementCommande;
	}
	public void setModePaiementCommande(String modePaiementCommande) {
		this.modePaiementCommande = modePaiementCommande;
	}
	public String getStatusPaiementCommande() {
		return statusPaiementCommande;
	}
	public void setStatusPaiementCommande(String statusPaiementCommande) {
		this.statusPaiementCommande = statusPaiementCommande;
	}
	public String getModeLivraisonCommande() {
		return modeLivraisonCommande;
	}
	public void setModeLivraisonCommande(String modeLivraisonCommande) {
		this.modeLivraisonCommande = modeLivraisonCommande;
	}
	public String getStatusLivraisonCommande() {
		return statusLivraisonCommande;
	}
	public void setStatusLivraisonCommande(String statusLivraisonCommande) {
		this.statusLivraisonCommande = statusLivraisonCommande;
	}
	
	

}
