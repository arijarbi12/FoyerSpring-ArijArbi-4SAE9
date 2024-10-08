package tn.esprit.foyeresprit.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.entities.Reservation;
import tn.esprit.foyeresprit.repositories.ReservationRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class IReservationServiceImpl implements IReservationService{
    ReservationRepository reservationRepository;
    @Override
    public Reservation addReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }

    @Override
    public void deleteReservation(String idReservation) {
      reservationRepository.deleteById(idReservation);
    }

    @Override
    public List<Reservation> getAllReservation() {
        return reservationRepository.findAll();
    }

    @Override
    public Reservation updateReservation(Reservation reservation) {
        return reservationRepository.save(reservation);
    }
}
