package projet.commun.service;

import projet.commun.dto.DtoMouvement;

import java.util.List;

public interface IServiceMouvement {

    DtoMouvement creerEtEnregistrerMouvement(DtoMouvement mouvementDto);

    DtoMouvement obtenirMouvementParId(int id);

    List<DtoMouvement> listeMouvements();

    // Ajoutez d'autres méthodes pour les opérations métier liées à Mouvement
}
