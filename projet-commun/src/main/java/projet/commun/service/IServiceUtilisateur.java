package projet.commun.service;

import projet.commun.dto.DtoUtilisateur;

public interface IServiceUtilisateur {

    DtoUtilisateur creerEtEnregistrerUtilisateur(DtoUtilisateur utilisateurDTO);

    DtoUtilisateur obtenirUtilisateurParId(int id);
 

    // Ajoutez d'autres méthodes pour les opérations métier liées à Utilisateur
}
