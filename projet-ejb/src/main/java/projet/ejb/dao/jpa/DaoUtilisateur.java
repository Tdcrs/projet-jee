package projet.ejb.dao.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projet.ejb.data.Utilisateur;

@Stateless
public class DaoUtilisateur {

    @PersistenceContext
    private EntityManager entityManager;

    public Utilisateur creerEtEnregistrerUtilisateur(Utilisateur utilisateur) {
        entityManager.persist(utilisateur);
        return utilisateur;
    }

    public Utilisateur obtenirUtilisateurParId(int id) {
        return entityManager.find(Utilisateur.class, id);
    }

    // Ajoutez d'autres méthodes pour les opérations CRUD
}

