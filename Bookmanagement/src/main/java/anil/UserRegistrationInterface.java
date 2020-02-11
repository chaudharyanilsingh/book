package anil;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface UserRegistrationInterface extends JpaRepository<UserRegistration,String> {

	UserRegistration findByEmail(String email);



	

}
