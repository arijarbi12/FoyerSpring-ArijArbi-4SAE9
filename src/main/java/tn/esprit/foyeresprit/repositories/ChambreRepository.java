package tn.esprit.foyeresprit.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.foyeresprit.entities.Chambre;
@Repository
public interface ChambreRepository extends JpaRepository<Chambre,Long> {
}
