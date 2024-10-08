package tn.esprit.foyeresprit.services;

import tn.esprit.foyeresprit.entities.Bloc;
import tn.esprit.foyeresprit.entities.Chambre;

import java.util.List;

public interface IBlocService {
    Bloc addBloc (Bloc bloc);
    void deleteBloc (Long idBloc);
    List<Bloc> getAllBloc();
    Bloc updateBloc (Bloc bloc);
}
