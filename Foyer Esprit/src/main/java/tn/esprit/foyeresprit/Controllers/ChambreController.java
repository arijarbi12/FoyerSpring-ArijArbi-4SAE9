package tn.esprit.foyeresprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.entities.Chambre;
import tn.esprit.foyeresprit.entities.Foyer;
import tn.esprit.foyeresprit.services.IChambreService;
import tn.esprit.foyeresprit.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/chambre")
public class ChambreController {
    IChambreService chambreService;

    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs

    @GetMapping("/get-all-chambre")
    public List<Chambre> getAllchambre() {
        List<Chambre> lischambre = chambreService.getAllChambre();
        return lischambre;
    }


    // http://localhost:8089/tpfoyer/chambre/add-chambre

    @PostMapping("/add-chambre")
    public Chambre addChambre(@RequestBody Chambre c) {
        Chambre chambre= chambreService.addChambre(c);
        return chambre;
    }
    // http://localhost:8089/tpfoyer/chambre/remove-chambre/{chambre-id}

    @DeleteMapping("/remove-chambre/{chambre-id}")
    public void deleteChambre(@PathVariable("bchambre-id") Long idChambre) {
        chambreService.deleteChambre(idChambre);
    }
    // http://localhost:8089/tpfoyer/chambre/modify-chambre

    @PutMapping("/update-chambre")
    public Chambre updateChambre(@RequestBody Chambre c) {
        Chambre chambre = chambreService.updateChambre(c);
        return chambre;
    }
}

