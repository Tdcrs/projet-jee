package projet.ejb.dao;

import projet.commun.dto.DtoUtilisateur;

import java.util.List;

public interface IDaoUtilisateur {

    DtoUtilisateur creerEtEnregistrerUtilisateur(DtoUtilisateur utilisateurDto);

    DtoUtilisateur obtenirUtilisateurParId(int id);

    List<DtoUtilisateur> listeUtilisateurs();

    void mettreAJourUtilisateur(DtoUtilisateur utilisateurDto);

    void supprimerUtilisateur(int id);

    // Ajoutez d'autres méthodes pour les opérations de DAO liées à Utilisateur
}
