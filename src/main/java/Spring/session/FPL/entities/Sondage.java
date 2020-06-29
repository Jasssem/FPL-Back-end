package Spring.session.FPL.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Sondage {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id_sondage;
	private String titre;
	private String description;
	private String choix;
	
	public Sondage(int id_sondage, String titre, String description, String choix) {
		super();
		Id_sondage = id_sondage;
		this.titre = titre;
		this.description = description;
		this.choix = choix;
	}

	public int getId_sondage() {
		return Id_sondage;
	}

	public void setId_sondage(int id_sondage) {
		Id_sondage = id_sondage;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getChoix() {
		return choix;
	}

	public void setChoix(String choix) {
		this.choix = choix;
	}

	@Override
	public String toString() {
		return "Sondage [Id_sondage=" + Id_sondage + ", titre=" + titre + ", description=" + description + ", choix="
				+ choix + "]";
	}
	
	
	
	
}
