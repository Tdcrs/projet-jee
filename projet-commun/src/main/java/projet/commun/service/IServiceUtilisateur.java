package projet.commun.service;

import java.util.List;

import projet.commun.dto.DtoUtilisateur;

public interface IServiceUtilisateur {

    DtoUtilisateur creerEtEnregistrerUtilisateur(DtoUtilisateur utilisateurDTO);

    DtoUtilisateur obtenirUtilisateurParId(int id);

	List<DtoUtilisateur> listerTout();

	void inserer(DtoUtilisateur map);

	void modifier(DtoUtilisateur map);

	void supprimer(int id);
 

    // Ajoutez d'autres méthodes pour les opérations métier liées à Utilisateur
}
