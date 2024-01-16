package projet.ejb.service.standard;

public class ServiceProduit implements IServiceProduit {

    // Champs
    @inject
    private IMapperEjb mapper;
    @inject
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

}
