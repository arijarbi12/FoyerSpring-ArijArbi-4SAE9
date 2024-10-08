package tn.esprit.foyeresprit.services;

import tn.esprit.foyeresprit.entities.Reservation;
import tn.esprit.foyeresprit.entities.Universite;

import java.util.List;

public interface IUniversiteService {
    Universite addUniversite (Universite universite);
    void deleteUniversite (Long idUniversite);
    List<Universite> getAllUniversite();
    Universite updateUniversite (Universite universite);
}
