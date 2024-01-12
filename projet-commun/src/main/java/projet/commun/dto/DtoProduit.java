package projet.commun.dto;

import java.io.Serializable;
import java.security.Timestamp;
import java.util.Date;

public class DtoProduit implements Serializable {

  
    private int id;
    private String nom;
    private String description;
    private double prixMinimal;
    private Date dateDebutEncheres;
    private Date dateFinEncheres;
    private Timestamp heureDebut; 
    private Timestamp heureFin; 

    // Ajoutez d'autres champs selon les besoins

    // Constructeurs, getters et setters
    
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
  	public String getDescription() {
  		return description;
  	}
  	public void setDescription(String description) {
  		this.description = description;
  	}
  	public double getPrixMinimal() {
  		return prixMinimal;
  	}
  	public void setPrixMinimal(double prixMinimal) {
  		this.prixMinimal = prixMinimal;
  	}
  	public Date getDateDebutEncheres() {
  		return dateDebutEncheres;
  	}
  	public void setDateDebutEncheres(Date dateDebutEncheres) {
  		this.dateDebutEncheres = dateDebutEncheres;
  	}
  	public Date getDateFinEncheres() {
  		return dateFinEncheres;
  	}
  	public void setDateFinEncheres(Date dateFinEncheres) {
  		this.dateFinEncheres = dateFinEncheres;
  	}
  	public Timestamp getHeureDebut() {
		return heureDebut;
	}
	public void setHeureDebut(Timestamp heureDebut) {
		this.heureDebut = heureDebut;
	}
	public Timestamp getHeureFin() {
		return heureFin;
	}
	public void setHeureFin(Timestamp heureFin) {
		this.heureFin = heureFin;
	}
	private static final long serialVersionUID = 1L;

}
