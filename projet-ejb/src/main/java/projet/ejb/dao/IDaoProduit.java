package projet.ejb.dao;

import projet.commun.dto.DtoCompte;
import projet.commun.dto.DtoProduit;
import projet.ejb.data.Produit;

import java.util.List;

public interface IDaoProduit {

    DtoProduit creerEtEnregistrerProduit(DtoProduit produitDto);

    DtoProduit obtenirProduitParId(int id);

    List<DtoProduit> listeProduits();

    void mettreAJourProduit(DtoProduit produitDto);

    void supprimerProduit(int id);

	Produit modifier(Produit produit);

	Produit creer(Produit produit);

	DtoCompte rechercherParId(Long id);

	DtoCompte rechercherParCompteId(Long compteId);

	void supprimer(Long id);

	DtoCompte rechercherTout();

    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Produit
}
