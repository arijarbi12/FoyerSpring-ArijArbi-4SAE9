package tn.esprit.foyeresprit.services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.foyeresprit.entities.Bloc;
import tn.esprit.foyeresprit.repositories.BlocRepository;

import java.util.List;
@Service
@AllArgsConstructor

public class IBlocServiceImpl implements IBlocService{

    BlocRepository blocRepository;
    @Override
    public Bloc addBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }

    @Override
    public void deleteBloc(Long idBloc) {
       blocRepository.deleteById(idBloc);
    }

    @Override
    public List<Bloc> getAllBloc() {
        return blocRepository.findAll();
    }

    @Override
    public Bloc updateBloc(Bloc bloc) {
        return blocRepository.save(bloc);
    }
}
