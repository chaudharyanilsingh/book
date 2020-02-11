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
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		UserRegistration user=regrepo.findByEmail(email);
		if(user==null)
		{
			throw new UsernameNotFoundException("User 404");
		}
		return new Userprincipal(user);
	}

}
