package tn.esprit.foyeresprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.entities.Etudiant;
import tn.esprit.foyeresprit.entities.Foyer;
import tn.esprit.foyeresprit.services.IEtudiantService;
import tn.esprit.foyeresprit.services.IFoyerService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/foyer")
public class FoyerController {
    IFoyerService foyerService;

    // http://localhost:8089/tpfoyer/foyer/retrieve-all-foyer

    @GetMapping("/get-all-foyer")
    public List<Foyer> getetudiant() {
        List<Foyer> lisfoyer = foyerService.getAllFoyer();
        return lisfoyer;
    }


    // http://localhost:8089/tpfoyer/foyer/add-foyer

    @PostMapping("/add-foyer")
    public Foyer addFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.addFoyer(f);
        return foyer;
    }
    // http://localhost:8089/tpfoyer/foyer/remove-foyer/{foyer-id}

    @DeleteMapping("/remove-foyer/{foyer-id}")
    public void deleteFoyer(@PathVariable("bfoyer-id") Long idFoyer) {
        foyerService.deleteFoyer(idFoyer);
    }
    // http://localhost:8089/tpfoyer/foyer/modify-foyer

    @PutMapping("/update-foyer")
    public Foyer updateFoyer(@RequestBody Foyer f) {
        Foyer foyer = foyerService.updateFoyer(f);
        return foyer;
    }
}


