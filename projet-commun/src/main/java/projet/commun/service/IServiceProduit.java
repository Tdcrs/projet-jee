package projet.commun.service;

import projet.commun.dto.DtoProduit;

import java.util.List;

public interface IServiceProduit {

    DtoProduit creerEtEnregistrerProduit(DtoProduit produitDto);

    DtoProduit obtenirProduitParId(int id);

    List<DtoProduit> listeProduits();

    // Ajoutez d'autres méthodes pour les opérations métier liées à Produit
}
