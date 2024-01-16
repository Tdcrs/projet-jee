package projet.jsf.data;

import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import projet.ejb.data.Utilisateur;

@SuppressWarnings("serial")
public class Mouvement implements Serializable {

    private static final long serialVersionUID = 1L;

    private int id;
    @NotNull(message = "L'utilisateur doit être renseignées")
    private Utilisateur utilisateur;
    @NotNull(message = "Le produit doit être renseignées")
    private Produit produit;
    private String type;
    @NotNull(message = "Le montant doit être renseignées")
    private double montant;
    @NotNull(message = "La date et heure doivent être renseignées")
    private Date dateHeure;

    // Constructeurs, getters et setters

    public Mouvement() {
    }

    public Mouvement(Utilisateur utilisateur, Produit produit, String type, double montant, Date dateHeure) {
        this.utilisateur = utilisateur;
        this.produit = produit;
        this.type = type;
        this.montant = montant;
        this.dateHeure = dateHeure;
    }

    // Getters & setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public Produit getProduit() {
        return produit;
    }

    public void setProduit(Produit produit) {
        this.produit = produit;
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

    public Date getDateHeure() {
        return dateHeure;
    }

    public void setDateHeure(Date dateHeure) {
        this.dateHeure = dateHeure;
    }
}
