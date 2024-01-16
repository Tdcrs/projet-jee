package projet.commun.service;

import projet.commun.dto.DtoProduit;

public interface IServiceProduit {
	
	DtoProduit creerProduit(DtoProduit produit);

    DtoProduit obtenirProduitParId(int id);
   

    // Ajoutez d'autres méthodes pour les opérations métier liées à Produit
}
