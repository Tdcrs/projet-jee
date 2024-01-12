package projet.commun.service;

import projet.commun.dto.DtoUtilisateur;

import java.util.List;

public interface IServiceUtilisateur {

    DtoUtilisateur creerEtEnregistrerUtilisateur(DtoUtilisateur utilisateurDTO);

    DtoUtilisateur obtenirUtilisateurParId(int id);

    List<DtoUtilisateur> listeUtilisateurs();

    // Ajoutez d'autres méthodes pour les opérations métier liées à Utilisateur
}
