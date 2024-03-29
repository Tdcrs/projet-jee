package projet.jsf.model.standard;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.ejb.EJB;
import javax.faces.view.ViewScoped;
import javax.inject.Inject;
import javax.inject.Named;

import projet.commun.dto.DtoUtilisateur;
import projet.commun.exception.ExceptionValidation;
import projet.commun.service.IServiceUtilisateur;
import projet.jsf.data.Utilisateur;
import projet.jsf.data.mapper.IMapper;
import projet.jsf.util.UtilJsf;

@SuppressWarnings("serial")
@Named
@ViewScoped
public class ModelUtilisateur implements Serializable {

    // Champs

    private List<Utilisateur> liste;

    private Utilisateur courant;

    @EJB
    private IServiceUtilisateur serviceUtilisateur;

    @Inject
    private IMapper mapper;

    // Getters

    public List<Utilisateur> getListe() {
        if (liste == null) {
            liste = new ArrayList<>();
            serviceUtilisateur.listerTout(); 
            for (DtoUtilisateur dto : serviceUtilisateur.listerTout()) {
                liste.add(mapper.map(dto));
             }
        }
        return liste;
    }

    public Utilisateur getCourant() {
        if (courant == null) {
            courant = new Utilisateur();
        }
        return courant;
    }

    // Initialisations

    public String actualiserCourant() {
        if (courant != null) {
            // You need to replace the following line with the actual method to retrieve a user by ID
            // For example: serviceUtilisateur.retrouver(courant.getId())
            // DtoUtilisateur dto = serviceUtilisateur.retrouver(courant.getId());
            // if (dto == null) {
            //     UtilJsf.messageError("L'utilisateur demandé n'existe pas");
            //     return "test/liste";
            // } else {
            //     courant = mapper.map(dto);
            // }
        }
        return null;
    }

    // Actions

    public String validerMiseAJour() {
        try {
            if (courant.getId() == 0) {
                serviceUtilisateur.inserer(mapper.map(courant));
            } else {
                serviceUtilisateur.modifier(mapper.map(courant));
            }
            UtilJsf.messageInfo("Mise à jour effectuée avec succès.");
            return "liste";
        } catch (NullPointerException e) {
            UtilJsf.messageError(e);
            return null;
        }
    }

    public String supprimer(Utilisateur item) {
        try {
            serviceUtilisateur.supprimer(item.getId());
            liste.remove(item);
            UtilJsf.messageInfo("Suppression effectuée avec succès.");
        } catch (NullPointerException e) {
            UtilJsf.messageError(e);
        }
        return null;
    }
}
