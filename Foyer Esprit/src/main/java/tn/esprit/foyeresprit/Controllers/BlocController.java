package tn.esprit.foyeresprit.Controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.foyeresprit.entities.Bloc;
import tn.esprit.foyeresprit.entities.Chambre;
import tn.esprit.foyeresprit.services.IBlocService;
import tn.esprit.foyeresprit.services.IChambreService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/bloc")
public class BlocController {
    IBlocService blocService;

    // http://localhost:8089/tpfoyer/bloc/retrieve-all-blocs

    @GetMapping("/get-all-bloc")
    public List<Bloc> getAllbloc() {
        List<Bloc> lisbloc = blocService.getAllBloc();
        return lisbloc;
    }


    // http://localhost:8089/tpfoyer/bloc/add-bloc

    @PostMapping("/add-bloc")
    public Bloc addBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.addBloc(b);
        return bloc;
    }
    // http://localhost:8089/tpfoyer/bloc/remove-bloc/{bloc-id}

    @DeleteMapping("/remove-bloc/{bloc-id}")
    public void deleteBloc(@PathVariable("bloc-id") Long idBloc) {
        blocService.deleteBloc(idBloc);
    }
    // http://localhost:8089/tpfoyer/bloc/modify-bloc

    @PutMapping("/update-bloc")
    public Bloc updateBloc(@RequestBody Bloc b) {
        Bloc bloc = blocService.updateBloc(b);
        return bloc;
    }
}

