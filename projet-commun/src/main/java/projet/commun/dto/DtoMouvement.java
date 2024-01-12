package projet.commun.dto;

import java.io.Serializable;
import java.util.Date;

public class DtoMouvement implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    private int idUtilisateur;
    private int idProduit;
    private Date dateMouvement;
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
	public Date getDateMouvement() {
		return dateMouvement;
	}
	public void setDateMouvement(Date dateMouvement) {
		this.dateMouvement = dateMouvement;
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
