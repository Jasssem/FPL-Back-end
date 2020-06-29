package Spring.session.FPL.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Spring.session.FPL.entities.User;



@Repository("UserRepository")
public interface UserRepository extends JpaRepository<User, Integer>{

}
