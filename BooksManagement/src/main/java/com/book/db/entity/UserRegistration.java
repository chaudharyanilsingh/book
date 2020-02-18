package com.book.db.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class UserRegistration {
	public UserRegistration() {
		super();
	}
	public UserRegistration(String firstName, String lastName, String email, String password) {
		super();
		FirstName = firstName;
		LastName = lastName;
		email = email;
		Password = password;
	}
	private String FirstName;
	private String LastName;
	@Id
	private String email;
	private String Password;
	public String getFirstName() {
		return FirstName;
	}
	public void setFirstName(String firstName) {
		FirstName = firstName;
	}
	public String getLastName() {
		return LastName;
	}
	public void setLastName(String lastName) {
		LastName = lastName;
	}

	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	@Override
	public String toString() {
		return "UserRegistration [FirstName=" + FirstName + ", LastName=" + LastName + ", Email=" + email
				+ ", Password=" + Password + "]";
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	

}
