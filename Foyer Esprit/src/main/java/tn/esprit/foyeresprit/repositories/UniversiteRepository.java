package tn.esprit.foyeresprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit.entities.Universite;

@Repository

public interface UniversiteRepository extends JpaRepository<Universite,Long> {
}
