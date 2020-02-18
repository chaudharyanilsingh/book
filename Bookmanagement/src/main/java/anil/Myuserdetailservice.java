package anil;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
@Service
public class Myuserdetailservice implements UserDetailsService {
@Autowired
private UserRegistrationInterface regrepo;
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		UserRegistration user=regrepo.findByEmail(username);
		System.out.println(user);
	if(user==null)
		{
		System.out.println("here is problem");
			throw new UsernameNotFoundException("User 404");
		}	
	return new Userprincipal(user);
	}

}
