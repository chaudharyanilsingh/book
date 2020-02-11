package anil;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
	public User() {
		super();
	}
	public User(String name, String password) {
		super();
		Name = name;
		Password = password;
	}
	@Id
	private String Name;
	private String Password;
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "User [Name=" + Name + ", Password=" + Password + "]";
	}

}
