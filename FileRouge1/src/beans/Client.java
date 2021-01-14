package beans;

public class Client {
	private String nomClient;
	private String prenomClient;
	private String adresseClient;
	private int telephoneClient;
	private String emailClient;
	
	public Client() {
		super();
	}
	
	public String getNomClient() {
		return nomClient;
	}
	public void setNomClient(String nomClient) {
		this.nomClient = nomClient;
	}
	public String getPrenomClient() {
		return prenomClient;
	}
	public void setPrenomClient(String prenomClient) {
		this.prenomClient = prenomClient;
	}
	public String getAdresseClient() {
		return adresseClient;
	}
	public void setAdresseClient(String adresseClient) {
		this.adresseClient = adresseClient;
	}
	public int getTelephoneClient() {
		return telephoneClient;
	}
	public void setTelephoneClient(int telephoneClient) {
		this.telephoneClient = telephoneClient;
	}
	public String getEmailClient() {
		return emailClient;
	}
	public void setEmailClient(String emailClient) {
		this.emailClient = emailClient;
	}
	
	@Override
	public String toString() {
		return "Client [nomClient=" + nomClient + ", prenomClient=" + prenomClient + ", adresseClient=" + adresseClient
				+ ", telephoneClient=" + telephoneClient + ", emailClient=" + emailClient + "]";
	}

}
