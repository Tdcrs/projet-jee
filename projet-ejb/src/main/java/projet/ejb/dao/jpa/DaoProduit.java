package projet.ejb.dao.jpa;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import projet.ejb.data.Produit;

@Stateless
public class DaoProduit {

    @PersistenceContext
    private EntityManager entityManager;

    public Produit creerProduit(Produit produit) {
        entityManager.persist(produit);
        return produit;
    }

    public Produit obtenirProduitParId(int id) {
        return entityManager.find(Produit.class, id);
    }

    // Ajoutez d'autres méthodes pour les opérations CRUD liées à Produit
}

