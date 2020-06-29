package Spring.session.FPL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.session.FPL.entities.Sondage;


@Repository("SondageRepository")
public interface SondageRepository  extends JpaRepository<Sondage, Integer> {



}
