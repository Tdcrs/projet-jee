package projet.ejb.dao;

import projet.commun.dto.DtoUtilisateur;
import projet.ejb.data.Utilisateur;

import java.util.List;

public interface IDaoUtilisateur {

    Utilisateur creerEtEnregistrerUtilisateur(Utilisateur utilisateur);

    Utilisateur obtenirUtilisateurParId(int id);

 
    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Utilisateur
}
