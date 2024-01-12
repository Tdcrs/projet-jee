package projet.ejb.dao;

import projet.commun.dto.DtoProduit;

import java.util.List;

public interface IDaoProduit {

    DtoProduit creerEtEnregistrerProduit(DtoProduit produitDto);

    DtoProduit obtenirProduitParId(int id);

    List<DtoProduit> listeProduits();

    void mettreAJourProduit(DtoProduit produitDto);

    void supprimerProduit(int id);

    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Produit
}
