package anil;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.*;

public interface UserLoginInterface extends CrudRepository<User,String> {

	

}
