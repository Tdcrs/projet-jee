package projet.ejb.data;

import static javax.persistence.GenerationType.IDENTITY;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "mouvement")
public class Mouvement {

    // Champs

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idMouvement")
    private int id;

    @ManyToOne
    @JoinColumn(name = "idUtilisateur")
    private Utilisateur utilisateur;

    @ManyToOne
    @JoinColumn(name = "idProduit")
    private Produit produit;

    @Column(name = "Type", nullable = false)
    private String type;

    @Column(name = "Montant", nullable = false)
    private double montant;

    @Column(name = "date_heure", nullable = false)
    private Date dateHeure;

    // Constructeurs, Getters & setters, equals() et hashcode()...

    // Constructeur par défaut
    public Mouvement() {
    }

    // Constructeur avec paramètres
    public Mouvement(int id, Utilisateur utilisateur, Produit produit, String type, double montant, Date dateHeure) {
        this.id = id;
        this.utilisateur = utilisateur;
        this.produit = produit;
        this.type = type;
        this.montant = montant;
        this.dateHeure = dateHeure;
    }

    // Getters et setters

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

    // equals() et hashcode()

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Mouvement other = (Mouvement) obj; 
        if (id != other.id)
            return false;
        return true;
    }
}
