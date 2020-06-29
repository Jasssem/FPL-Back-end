package Spring.session.FPL.services;

import java.util.List;

import Spring.session.FPL.entities.Sondage;


public interface SondageService {
		public void AjoutSondage(Sondage sondage);
		public Sondage getSondageById(Integer id);
		public List<Sondage> getAll();
}
