package metier;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import beans.Client;


@WebServlet("/CreationClient")
public class CreationClient extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// Récupération des données saisies 
		// envoyées en tant que paramètres
		// de la requête GET générée à la validation du formulaire
		
		String nomClient = request.getParameter("nomClient");
		String prenomClient = request.getParameter("prenomClient");
		String adresseClient = request.getParameter("adresseClient");
		String telephoneClient = request.getParameter("telephoneClient");
		String emailClient = request.getParameter("emailClient");
		
		/**
		 * création du bean Client et initialisation avec les données récupérées
		 */
		Client c = new Client();
		c.setNomClient(nomClient);
		c.setPrenomClient(prenomClient);
		c.setAdresseClient(adresseClient);
		c.setTelephoneClient(Integer.parseInt(telephoneClient));
		c.setEmailClient(emailClient);
		
		System.out.println(c.getNomClient());
		
		request.setAttribute("client", c);
		request.getRequestDispatcher("/afficheClient.jsp").forward(request, response);
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doGet(request, response);
	}

}
