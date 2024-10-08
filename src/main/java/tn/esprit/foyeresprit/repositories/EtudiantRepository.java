package tn.esprit.foyeresprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit.entities.Etudiant;
@Repository

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
}
