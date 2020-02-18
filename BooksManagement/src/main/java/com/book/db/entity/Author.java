package com.book.db.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Author {
	public Author(String AuthorName, String email, String address, int contactNumber) {
		super();
		authorName = AuthorName;
		Email = email;
		Address = address;
		ContactNumber = contactNumber;
	
	}
	public Author() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private String authorName;
	private String Email;
	private String Address;
	private int ContactNumber;

	public void setAuthorName(String AuthorName) {
		authorName = AuthorName;
	}
	public String getAuthorName()
	{
		return authorName;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public int getContactNumber() {
		return ContactNumber;
	}
	public void setContactNumber(int contactNumber) {
		ContactNumber = contactNumber;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Author [id=" + id + ", AuthorName=" + authorName + ", Email=" + Email + ", Address=" + Address
				+ ", ContactNumber=" + ContactNumber + "]";
	}


	

}
