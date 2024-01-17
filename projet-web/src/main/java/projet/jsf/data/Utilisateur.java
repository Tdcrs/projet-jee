package projet.jsf.data;

import java.io.Serializable;

import javax.validation.constraints.NotNull;

@SuppressWarnings("serial")
public class Utilisateur implements Serializable {

	private int id;
	@NotNull(message = "Le nom doit être renseignées")
	private String nom;
	@NotNull(message = "Le prénom doit être renseignées")
	private String prenom;
	@NotNull(message = "Le mail doit être renseignées")
	private String adresseEmail;
	@NotNull(message = "Le pseudo doit être renseignées")
	private String pseudo;
	@NotNull(message = "Le Mot de passe doit être renseignées")
	private String motDePasse;
	@NotNull(message = "Le role doit être renseignées")
	private String role;
	@NotNull(message = "Le crédit doit être renseignées")
	private double credit;

	// Constructeurs, getters et setters
	
	public Utilisateur() {
		
	}

	public Utilisateur(int id, String nom, String prenom, String adresseEmail, String pseudo, String motDePasse,
			String role, double credit) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.adresseEmail = adresseEmail;
		this.pseudo = pseudo;
		this.motDePasse = motDePasse;
		this.role = role;
		this.credit = credit;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getAdresseEmail() {
		return adresseEmail;
	}

	public void setAdresseEmail(String adresseEmail) {
		this.adresseEmail = adresseEmail;
	}

	public String getPseudo() {
		return pseudo;
	}

	public void setPseudo(String pseudo) {
		this.pseudo = pseudo;
	}

	public String getMotDePasse() {
		return motDePasse;
	}

	public void setMotDePasse(String motDePasse) {
		this.motDePasse = motDePasse;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public double getCredit() {
		return credit;
	}

	public void setCredit(double credit) {
		this.credit = credit;
	}

}
