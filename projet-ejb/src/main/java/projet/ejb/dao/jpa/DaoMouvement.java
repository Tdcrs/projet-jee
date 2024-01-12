package projet.ejb.dao.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projet.ejb.data.Mouvement;

@Stateless
public class DaoMouvement {

    @PersistenceContext
    private EntityManager entityManager;

    public Mouvement creerMouvement(Mouvement mouvement) {
        entityManager.persist(mouvement);
        return mouvement;
    }

    public Mouvement obtenirMouvementParId(int id) {
        return entityManager.find(Mouvement.class, id);
    }

    // Ajoutez d'autres méthodes pour les opérations CRUD liées à Mouvement
}

