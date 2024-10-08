package tn.esprit.foyeresprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.entities.Bloc;
import tn.esprit.foyeresprit.entities.Etudiant;
import tn.esprit.foyeresprit.services.IBlocService;
import tn.esprit.foyeresprit.services.IEtudiantService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/etudiant")
public class EtudiantController {
    IEtudiantService etudiantService;

    // http://localhost:8089/tpfoyer/etudiant/retrieve-all-etudiant

    @GetMapping("/get-all-etudiant")
    public List<Etudiant> getetudiant() {
        List<Etudiant> lisetudiant = etudiantService.getAllEtudiant();
        return lisetudiant;
    }


    // http://localhost:8089/tpfoyer/etudiant/add-etudiant

    @PostMapping("/add-etudiant")
    public Etudiant addEtudinat(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.addEtudiant(e);
        return etudiant;
    }
    // http://localhost:8089/tpfoyer/etudiant/remove-etudiant/{etudiant-id}

    @DeleteMapping("/remove-etudiant/{etudiant-id}")
    public void deleteEtudiant(@PathVariable("betudiant-id") Long idEtudiant) {
        etudiantService.deleteEtudiant(idEtudiant);
    }
    // http://localhost:8089/tpfoyer/etudiant/modify-etudiant

    @PutMapping("/update-etudiant")
    public Etudiant updateEtudiant(@RequestBody Etudiant e) {
        Etudiant etudiant = etudiantService.updateEtudiant(e);
        return etudiant;
    }
}

