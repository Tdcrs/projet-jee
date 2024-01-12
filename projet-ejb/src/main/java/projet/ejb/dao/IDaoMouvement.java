package projet.ejb.dao;

import projet.commun.dto.DtoMouvement;

import java.util.List;

public interface IDaoMouvement{

    DtoMouvement creerEtEnregistrerMouvement(DtoMouvement mouvementDto);

    DtoMouvement obtenirMouvementParId(int id);

    List<DtoMouvement> listeMouvements();

    void mettreAJourMouvement(DtoMouvement mouvementDto);

    void supprimerMouvement(int id);

    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Mouvement
}
