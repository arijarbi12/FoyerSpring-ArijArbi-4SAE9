package tn.esprit.foyeresprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.entities.Foyer;
import tn.esprit.foyeresprit.entities.Reservation;
import tn.esprit.foyeresprit.services.IFoyerService;
import tn.esprit.foyeresprit.services.IReservationService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/reservation")
public class ReservationController {
    IReservationService reservationService;

    // http://localhost:8089/tpfoyer/reservation/retrieve-all-reservation

    @GetMapping("/get-all-reservation")
    public List<Reservation> getAllreservation() {
        List<Reservation> lisreservation = reservationService.getAllReservation();
        return lisreservation;
    }


    // http://localhost:8089/tpfoyer/reservation/add-reservation

    @PostMapping("/add-reservation")
    public Reservation addReservation(@RequestBody Reservation r) {
        Reservation reservation = reservationService.addReservation(r);
        return reservation;
    }
    // http://localhost:8089/tpfoyer/reservation/remove-reservation/{reservation-id}

    @DeleteMapping("/remove-reservation/{reservation-id}")
    public void deleteReservation(@PathVariable("breservation-id") String idReservation) {
        reservationService.deleteReservation(idReservation);
    }
    // http://localhost:8089/tpfoyer/reservation/modify-reservation

    @PutMapping("/update-reservation")
    public Reservation updateReservation(@RequestBody Reservation r) {
        Reservation reservation= reservationService.updateReservation(r);
        return reservation;
    }
}
