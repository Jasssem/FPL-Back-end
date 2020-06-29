package Spring.session.FPL.services;

import java.util.List;
import Spring.session.FPL.entities.User;



public interface UserService {
	
	public void AjoutUser(User user);

	public void deleteUser(User user);

	public User getUserById(Integer id);

	public List<User> getAll();

	public User loadByUsername(String username);



}
