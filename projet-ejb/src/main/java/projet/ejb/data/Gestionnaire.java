package projet.ejb.data;

import java.math.BigDecimal;
import java.util.List;

import javax.annotation.ManagedBean;
import javax.enterprise.context.RequestScoped;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@ManagedBean
@RequestScoped
public class Gestionnaire extends Utilisateur {

    @PersistenceContext
    private EntityManager entityManager;

    // Autres méthodes et propriétés héritées d'UtilisateurBean

    @Transactional
    public void creerUtilisateur() {
    }

    @Transactional
    public void modifierUtilisateur(Utilisateur utilisateur) {
        // Logique pour modifier un utilisateur
        entityManager.merge(utilisateur);
    }

    @Transactional
    public void supprimerUtilisateur(Utilisateur utilisateur) {
        // Logique pour supprimer un utilisateur
        entityManager.remove(entityManager.merge(utilisateur));
    }

    public List<Mouvement> getMouvementsUtilisateur(Utilisateur utilisateur) {
        String jpql = "SELECT m FROM Mouvement m WHERE m.utilisateur = :utilisateur";
        TypedQuery<Mouvement> query = entityManager.createQuery(jpql, Mouvement.class);
        query.setParameter("utilisateur", utilisateur);
        return query.getResultList();
    }

    // Autres méthodes spécifiques au rôle du gestionnaire...
}