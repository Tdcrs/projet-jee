package projet.ejb.data;

import static javax.persistence.GenerationType.IDENTITY;

import java.security.Timestamp;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "produit")
public class Produit {

    // Champs

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idproduit")
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "photo")
    private String photo;

    @Column(name = "description")
    private String description;

    @Column(name = "prix_minimal")
    private double prixMinimal;

    @Column(name = "dateDebut")
    private Date dateDebut;
    
    @Column(name = "heureDebut")
    private Timestamp heureDebut; 

    @Column(name = "dateFin")
    private Date dateFin;
    
    @Column(name = "heureFin")
    private Timestamp heureFin; 

    @Column(name = "vente_cloturee")
    private boolean venteCloturee;

    // Constructeurs

    public Produit() {
    }

    public Produit(int id, String nom, String photo, String description, double prixMinimal, Date dateDebut, 
            Date dateFin, boolean venteCloturee, Timestamp heureDebut, Timestamp heureFin ) {
        this.id = id;
        this.nom = nom;
        this.photo = photo;
        this.description = description;
        this.prixMinimal = prixMinimal;
        this.dateDebut = dateDebut;
        this.dateFin = dateFin;
        this.venteCloturee = venteCloturee;
        this.heureDebut = heureDebut; 
        this.heureFin = heureFin; 
    }

    // Getters & setters

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

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
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

    public Date getDateDebut() {
        return dateDebut;
    }

    public void setDateDebut(Date dateDebut) {
        this.dateDebut = dateDebut;
    }

    public Date getDateHeureFinEncheres() {
        return dateFin;
    }

    public void setDateFin(Date dateFin) {
        this.dateFin = dateFin;
    }

    public boolean isVenteCloturee() {
        return venteCloturee;
    }

    public void setVenteCloturee(boolean venteCloturee) {
        this.venteCloturee = venteCloturee;
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
        Produit other = (Produit) obj;
        if (id != other.id)
            return false;
        return true;
    }
}
