package projet.commun.dto;

import java.io.Serializable;

public class DtoUtilisateur implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private String nom;
    private String prenom;
    private String email;
    
    
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

    // Ajoutez d'autres champs selon les besoins

    // Constructeurs, getters et setters
}
