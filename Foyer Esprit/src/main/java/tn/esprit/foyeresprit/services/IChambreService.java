package tn.esprit.foyeresprit.services;

import tn.esprit.foyeresprit.entities.Chambre;

import java.util.List;

public interface IChambreService {
    Chambre addChambre (Chambre chambre);
    void deleteChambre (Long idChambre);
     List<Chambre> getAllChambre ();
     Chambre updateChambre (Chambre chambre);
}
