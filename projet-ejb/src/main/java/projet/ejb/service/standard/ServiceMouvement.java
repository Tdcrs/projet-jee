package projet.ejb.service.standard;

import java.util.List;

import javax.inject.Inject;

import projet.commun.dto.DtoMouvement;
import projet.commun.service.IServiceMouvement;
import projet.ejb.dao.IDaoMouvement;
import projet.ejb.data.Mouvement;
import projet.ejb.data.mapper.IMapperEjb;

public class ServiceMouvement implements IServiceMouvement {

// Champs
@Inject
private IMapperEjb mapper;
@Inject
private IDaoMouvement daoMouvement;

	@Override
	public DtoMouvement creerEtEnregistrerMouvement(DtoMouvement mouvementDto) {
		// TODO Auto-generated method stub

        Mouvement mouvement = mapper.map(mouvementDto);
        mouvement = daoMouvement.creerEtEnregistrerMouvement(mouvement);
        return mapper.map(mouvement);
	}

	@Override
	public DtoMouvement obtenirMouvementParId(int id) {
		// TODO Auto-generated method stub

        return mapper.map(daoMouvement.obtenirMouvementParId(id));

		return null;
	}

	@Override
	public List<DtoMouvement> listeMouvements() {
		// TODO Auto-generated method stub
            
            return mapper.map(daoMouvement.rechercherTout());
		return null;
	}

}
