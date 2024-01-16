package projet.ejb.service.standard;

import java.util.List;

import javax.inject.Inject;

import projet.commun.dto.DtoProduit;
import projet.commun.service.IServiceProduit;
import projet.ejb.dao.IDaoProduit;
import projet.ejb.data.Produit;
import projet.ejb.data.mapper.IMapperEjb;

public class ServiceProduit implements IServiceProduit {

    // Champs
    @Inject
    private IMapperEjb mapper;
    @Inject
    private IDaoProduit daoProduit;
    // Actions
    @Override
    public DtoProduit produitCreer(DtoProduit dto) {
        Produit produit = mapper.map(dto);
        produit = daoProduit.creer(produit);
        return mapper.map(produit);
    }

    @Override
    public DtoProduit produitRechercherParId(Long id) {
        return mapper.map(daoProduit.rechercherParId(id));
    }

    @Override
    public List<DtoProduit> produitRechercherParCompteId(Long compteId) {
        return mapper.map(daoProduit.rechercherParCompteId(compteId));
    }

    @Override
    public List<DtoProduit> produitRechercherTout() {
        return mapper.map(daoProduit.rechercherTout());
    }

    @Override
    public void produitSupprimer(Long id) {
        daoProduit.supprimer(id);
    }

    @Override
    public DtoProduit produitModifier(DtoProduit dto) {
        Produit produit = mapper.map(dto);
        produit = daoProduit.modifier(produit);
        return mapper.map(produit);
    }

	@Override
	public DtoProduit creerEtEnregistrerProduit(DtoProduit produitDto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DtoProduit obtenirProduitParId(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<DtoProduit> listeProduits() {
		// TODO Auto-generated method stub
		return null;
	}

}
