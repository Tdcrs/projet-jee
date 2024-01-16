package projet.jsf.data;

import java.io.Serializable;
import java.security.Timestamp;
import java.sql.Date;
import java.util.Objects;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.PositiveOrZero;
import javax.validation.constraints.Size;

@SuppressWarnings("serial")
public class Produit implements Serializable {

    // Champs

    Integer id; 

    @NotBlank(message = "Le nom du produit doit être renseigné")
    @Size(max = 50, message = "Valeur trop longue pour le nom du produit : 50 caractères maximum")
    private String nom;

    // Ajoutez d'autres champs en fonction des besoins

    @PositiveOrZero(message = "Le prix minimal doit être un nombre positif ou nul")
    private double prixMinimal;

    @NotNull(message = "La date et heure de début des enchères doivent être renseignées")
    private Date dateDebutEncheres;

    @NotNull(message = "La date et heure de fin des enchères doivent être renseignées")
    private Date dateFinEncheres;
    
    private String description;
    
    @NotNull(message = "La date et heure de début des enchères doivent être renseignées")
    private Date dateDebut;
    @NotNull(message = "La date et heure de début des enchères doivent être renseignées") 
    private Timestamp heureDebut;
    @NotNull(message = "La date et heure de fin des enchères doivent être renseignées")
    private Date dateFin;
    @NotNull(message = "La date et heure de fin des enchères doivent être renseignées")
	private Timestamp heureFin;
    @NotNull(message = "Veuillez cochez la case")
    private boolean venteCloturee;

    // Constructeurs

    public Produit() {
    }

    public Produit(Integer id, String nom, double prixMinimal, Date dateDebutEncheres, Date dateFinEncheres,
            boolean venteCloturee) {
        this.id = id;
        this.nom = nom;
        this.prixMinimal = prixMinimal;
        this.dateDebutEncheres = dateDebutEncheres;
        this.dateFinEncheres = dateFinEncheres;
        this.venteCloturee = venteCloturee;
    }

    // Getters & setters
    
    public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Date getDateDebut() {
		return dateDebut;
	}

	public void setDateDebut(Date dateDebut) {
		this.dateDebut = dateDebut;
	}

	public Timestamp getHeureDebut() {
		return heureDebut;
	}

	public void setHeureDebut(Timestamp heureDebut) {
		this.heureDebut = heureDebut;
	}

	public Date getDateFin() {
		return dateFin;
	}

	public void setDateFin(Date dateFin) {
		this.dateFin = dateFin;
	}

	public Timestamp getHeureFin() {
		return heureFin;
	}

	public void setHeureFin(Timestamp heureFin) {
		this.heureFin = heureFin;
	}

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
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

    public boolean isVenteCloturee() {
        return venteCloturee;
    }

    public void setVenteCloturee(boolean venteCloturee) {
        this.venteCloturee = venteCloturee;
    }

    // hashCode() & equals()

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        var other = (Produit) obj;
        return Objects.equals(id, other.id);
    }
}