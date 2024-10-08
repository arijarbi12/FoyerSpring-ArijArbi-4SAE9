package tn.esprit.foyeresprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.entities.Reservation;
import tn.esprit.foyeresprit.entities.Universite;
import tn.esprit.foyeresprit.services.IReservationService;
import tn.esprit.foyeresprit.services.IUniversiteService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/universite")
public class UniversiteController {
    IUniversiteService universiteService;

    // http://localhost:8089/tpfoyer/universite/retrieve-all-universite

    @GetMapping("/get-all-universite")
    public List<Universite> getAlluniversite() {
        List<Universite> lisuniversite = universiteService.getAllUniversite();
        return lisuniversite;
    }


    // http://localhost:8089/tpfoyer/universite/add-universite

    @PostMapping("/add-universite")
    public Universite addUniversite(@RequestBody Universite u) {
        Universite  universite = universiteService.addUniversite(u);
        return universite;
    }
    // http://localhost:8089/tpfoyer/universite/remove-universite/{universite-id}

    @DeleteMapping("/remove-universite/{universite-id}")
    public void deleteUniversite(@PathVariable("buniversite-id") Long idUniversite) {
        universiteService.deleteUniversite(idUniversite);
    }
    // http://localhost:8089/tpfoyer/universite/modify-universite

    @PutMapping("/update-universite")
    public Universite updateUniversite(@RequestBody Universite u) {
        Universite universite= universiteService.updateUniversite(u);
        return universite;
    }
}

