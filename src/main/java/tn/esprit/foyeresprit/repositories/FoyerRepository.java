package tn.esprit.foyeresprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit.entities.Foyer;
@Repository

public interface FoyerRepository extends JpaRepository<Foyer,Long> {
}
