package projet.commun.dto;

import java.io.Serializable;
import java.util.Date;

public class DtoMouvement implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int idUtilisateur;
    private int idProduit;
    private Date date_heure; 
    private String type; 
    private double montant;
    
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getIdUtilisateur() {
		return idUtilisateur;
	}
	public void setIdUtilisateur(int idUtilisateur) {
		this.idUtilisateur = idUtilisateur;
	}
	public int getIdProduit() {
		return idProduit;
	}
	public void setIdProduit(int idProduit) {
		this.idProduit = idProduit;
	}
	public Date getDate_heure() {
		return date_heure;
	}
	public void setDate_heure(Date date_heure) {
		this.date_heure = date_heure;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public double getMontant() {
		return montant;
	}
	public void setMontant(double montant) {
		this.montant = montant;
	}
    
    


    // Ajoutez d'autres champs selon les besoins

    // Constructeurs, getters et setters
    
    
}
