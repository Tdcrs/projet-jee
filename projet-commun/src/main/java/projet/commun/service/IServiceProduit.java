package projet.commun.service;

import projet.commun.dto.DtoProduit;

public interface IServiceProduit {
	
	DtoProduit creerProduit(DtoProduit produit);

    DtoProduit obtenirProduitParId(int id);

	DtoProduit[] listerTout();

	DtoProduit retrouver(Integer id);

	

	void supprimer(Integer id);

	void inserer(DtoProduit map);

	void modifier(DtoProduit map);
    

    // Ajoutez d'autres méthodes pour les opérations métier liées à Produit
}
