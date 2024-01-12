package projet.ejb.data;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "utilisateur")
public class Utilisateur {

    // Champs

    @Id
    @GeneratedValue(strategy = IDENTITY)
    @Column(name = "idutilisateur")
    private int id;

    @Column(name = "nom")
    private String nom;

    @Column(name = "prenom")
    private String prenom;

    @Column(name = "mail")
    private String adresseEmail;

    @Column(name = "pseudo")
    private String pseudo;

    @Column(name = "mdp")
    private String motDePasse;

    @Column(name = "role")
    private String role; // Peut être "Usager" ou "Gestionnaire"

    @Column(name = "credit")
    private double credit;

    // Constructeurs

    public Utilisateur() {
    }

    public Utilisateur(int id, String nom, String prenom, String adresseEmail, String pseudo, String motDePasse,
            String role, double credit) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.adresseEmail = adresseEmail;
        this.pseudo = pseudo;
        this.motDePasse = motDePasse;
        this.role = role;
        this.credit = credit;
    }

    // Getters & setters

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

    // equals() et hashcode()

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + id;
        return result;
    }
}