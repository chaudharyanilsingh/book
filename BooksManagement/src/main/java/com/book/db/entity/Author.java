package com.book.db.entity;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class Author {
	
	public Author(int id, String authorName, String email, String address, int contactNumber) {
		super();
		this.id = id;
		this.authorName = authorName;
		this.email = email;
		this.address = address;
		this.contactNumber = contactNumber;
	}
	public Author() {
		super();
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	//@OneToMany
	//private List <Books> books;
	private String authorName;
	private String email;
	private String address;
	private int contactNumber;

	public void setAuthorName(String AuthorName) {
		authorName = AuthorName;
	}
	public String getAuthorName()
	{
		return authorName;
	}

	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(int contactNumber) {
		this.contactNumber = contactNumber;
	}
	@Override
	public String toString() {
		return "Author [id=" + id + ", authorName=" + authorName + ", email=" + email + ", address=" + address
				+ ", contactNumber=" + contactNumber + "]";
	}
	//public List<Books> getBooks() {
	//	return books;
	//}
	//public void setBooks(List<Books> books) {
	//	this.books = books;
	//}



	

}
