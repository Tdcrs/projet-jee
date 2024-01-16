package projet.ejb.dao;

import projet.ejb.data.Produit;

public interface IDaoProduit {

	Produit creerProduit(Produit produit);

    Produit obtenirProduitParId(int id);
 
    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Produit
}
