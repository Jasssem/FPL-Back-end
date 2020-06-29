package Spring.session.FPL.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.session.FPL.entities.Sondage;
import Spring.session.FPL.repositories.SondageRepository;


@Service("SondageService")
public class SondageServicelmpl implements SondageService {
	
	@Autowired
	SondageRepository sondagerepository;
	
	@PersistenceContext
	EntityManager em;
	
	
	@Override
	public void AjoutSondage(Sondage sondage) {
		sondagerepository.save(sondage);
	}

	@Override
	public Sondage getSondageById(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Sondage> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
