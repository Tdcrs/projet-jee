package projet.ejb.service.standard;

import java.util.List;

import javax.inject.Inject;

import projet.commun.dto.DtoUtilisateur;
import projet.commun.service.IServiceUtilisateur;
import projet.ejb.dao.IDaoUtilisateur;
import projet.ejb.data.Utilisateur;
import projet.ejb.data.mapper.IMapperEjb;

public class ServiceUtilisateur implements IServiceUtilisateur {

	
	@Inject
    private IMapperEjb mapper;
    @Inject
    private IDaoUtilisateur daoUtilisateur;
    
    @Override
    public DtoUtilisateur creerEtEnregistrerUtilisateur(DtoUtilisateur utilisateurDTO) {
        Utilisateur utilisateurEntity = mapper.map(utilisateurDTO);
        Utilisateur nouvelUtilisateur = daoUtilisateur.creerEtEnregistrerUtilisateur(utilisateurEntity);
        return mapper.map(nouvelUtilisateur);
    }
    @Override
    public DtoUtilisateur obtenirUtilisateurParId(int id) {
        Utilisateur utilisateurEntity = daoUtilisateur.obtenirUtilisateurParId(id);
   
        return mapper.map(utilisateurEntity);
    }
	@Override
	public List<DtoUtilisateur> listerTout() {
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public void inserer(DtoUtilisateur map) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void modifier(DtoUtilisateur map) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void supprimer(int id) {
		// TODO Auto-generated method stub
		
	}
    

}
