package tn.esprit.foyeresprit.services;

import tn.esprit.foyeresprit.entities.Bloc;
import tn.esprit.foyeresprit.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation addReservation (Reservation reservation);
    void deleteReservation (String idReservation);
    List<Reservation> getAllReservation();
    Reservation updateReservation (Reservation reservation);
}
