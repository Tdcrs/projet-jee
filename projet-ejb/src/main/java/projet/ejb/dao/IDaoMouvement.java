package projet.ejb.dao;

import projet.ejb.data.Mouvement;

public interface IDaoMouvement{

    Mouvement creerEtEnregistrerMouvement(Mouvement mouvementDto);

	Mouvement obtenirMouvementParId(int id);

    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Mouvement
}
