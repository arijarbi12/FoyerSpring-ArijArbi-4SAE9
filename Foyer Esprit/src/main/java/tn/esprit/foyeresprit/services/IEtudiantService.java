package tn.esprit.foyeresprit.services;

import tn.esprit.foyeresprit.entities.Bloc;
import tn.esprit.foyeresprit.entities.Etudiant;

import java.util.List;

public interface IEtudiantService {
    Etudiant addEtudiant (Etudiant etudiant);
    void deleteEtudiant (Long idEtudiant);
    List<Etudiant> getAllEtudiant();
    Etudiant updateEtudiant (Etudiant etudiant);
}
