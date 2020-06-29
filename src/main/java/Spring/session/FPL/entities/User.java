package Spring.session.FPL.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;






@Entity
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Id_user;
	private String nom;
	private String prenom;
	private String email;
	private String username;
	private String password;
	
	

	public User() {
		super();
	}


	public User(int id_user, String nom, String prenom, String email, String username, String password) {
		super();
		Id_user = id_user;
		this.nom = nom;
		this.prenom = prenom;
		this.email = email;
		this.username = username;
		this.password = password;
	}


	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getId_user() {
		return Id_user;
	}


	public void setId_user(int id_user) {
		Id_user = id_user;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}


	@Override
	public String toString() {
		return "User [Id_user=" + Id_user + ", nom=" + nom + ", prenom=" + prenom + ", email=" + email + ", username="
				+ username + ", password=" + password + "]";
	}

	
	
}
