package tn.esprit.foyeresprit.services;

import tn.esprit.foyeresprit.entities.Etudiant;
import tn.esprit.foyeresprit.entities.Foyer;

import java.util.List;

public interface IFoyerService {
    Foyer addFoyer (Foyer foyer);
    void deleteFoyer (Long idFoyer);
    List<Foyer> getAllFoyer();
    Foyer updateFoyer (Foyer foyer);
}
