package Spring.session.FPL.services;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import Spring.session.FPL.entities.User;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Spring.session.FPL.repositories.UserRepository;






@Service("UserService")
public class UserServicelmpl implements UserService {
	@Autowired
	UserRepository userrepository;
	
	@PersistenceContext
	EntityManager em;
	
	@Override
	public void AjoutUser(User user) {
		userrepository.save(user);
		
	}

	@Override
	public void deleteUser(User user) {
		userrepository.delete(user);
		
	}

	@Override
	public User getUserById(Integer id) {
		return userrepository.findById(id).get();
	}

	@Override
	public List<User> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User loadByUsername(String username) {
		TypedQuery<User> query = (TypedQuery<User>) em
				.createQuery("SELECT u FROM User u WHERE u.username = :username", User.class);
		User user = query.setParameter("username", username).getSingleResult();
		return user;
	}


	
	
	

	
	
}
