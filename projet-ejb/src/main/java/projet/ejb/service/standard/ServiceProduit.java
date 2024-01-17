package projet.ejb.service.standard;

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
	public DtoProduit creerProduit(DtoProduit produitDto) {
		// Mapper le DTO en entité
        Produit produitEntity = mapper.map(produitDto);
        
        // Appeler la méthode du DAO pour créer le produit
        Produit nouveauProduit = daoProduit.creerProduit(produitEntity);
        
        // Mapper l'entité résultante en DTO
        return mapper.map(nouveauProduit);
	}
    
    @Override
	public DtoProduit obtenirProduitParId(int id) {
		// Appeler la méthode du DAO pour obtenir le produit par ID
        Produit produitEntity = daoProduit.obtenirProduitParId(id);
        
        // Mapper l'entité résultante en DTO
        return mapper.map(produitEntity);
	}

	@Override
	public DtoProduit[] listerTout() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public DtoProduit retrouver(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void supprimer(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserer(DtoProduit map) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void modifier(DtoProduit map) {
		// TODO Auto-generated method stub
		
	} 


}
