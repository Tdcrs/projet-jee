package projet.jsf.data.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

import projet.commun.dto.DtoCompte;
import projet.commun.dto.DtoMouvement;
import projet.commun.dto.DtoProduit;
import projet.commun.dto.DtoUtilisateur;
import projet.ejb.data.Mouvement;
import projet.ejb.data.Produit;
import projet.ejb.data.Utilisateur;
import projet.jsf.data.Compte;

@Mapper(componentModel = "cdi")
public interface IMapper {

	// Compte

	Compte map(DtoCompte source);

	DtoCompte map(Compte source);

	Compte duplicate(Compte source);

	Compte update(@MappingTarget Compte target, Compte source);

	Mouvement map(DtoMouvement source);

	DtoMouvement map(Mouvement source);

	Utilisateur map(DtoUtilisateur source);

	DtoUtilisateur map(Utilisateur source);

	Produit map(DtoProduit source);

	DtoProduit map(Produit source);
}
