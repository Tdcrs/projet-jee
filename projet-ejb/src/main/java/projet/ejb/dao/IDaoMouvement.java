package projet.ejb.dao;

import projet.commun.dto.DtoMouvement;
import projet.ejb.data.Mouvement;

import java.util.List;

public interface IDaoMouvement{

    Mouvement creerEtEnregistrerMouvement(Mouvement mouvementDto);

    DtoMouvement obtenirMouvementParId(int id);

    List<DtoMouvement> listeMouvements();

    void mettreAJourMouvement(DtoMouvement mouvementDto);

    void supprimerMouvement(int id);

    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Mouvement
}
