package projet.commun.service;

import projet.commun.dto.DtoProduit;

import java.util.List;

public interface IServiceProduit {

    DtoProduit creerEtEnregistrerProduit(DtoProduit produitDto);

    DtoProduit obtenirProduitParId(int id);

    List<DtoProduit> listeProduits();

	DtoProduit produitModifier(DtoProduit dto);

	void produitSupprimer(Long id);

	DtoProduit produitCreer(DtoProduit dto);

	DtoProduit produitRechercherParId(Long id);

	List<DtoProduit> produitRechercherParCompteId(Long compteId);

	List<DtoProduit> produitRechercherTout();

    // Ajoutez d'autres méthodes pour les opérations métier liées à Produit
}
