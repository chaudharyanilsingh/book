package com.book.db.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Publisher 
{
	public Publisher(int id, String publisherName, String publisherAddress, String publisherEmail) {
		super();
		this.id = id;
		this.publisherName = publisherName;
		this.publisherAddress = publisherAddress;
		this.publisherEmail = publisherEmail;
	}
	public Publisher() {
		super();
	}
	@Id 
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String publisherName;
	private String publisherAddress;
	private String publisherEmail;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPublisherName() {
		return publisherName;
	}
	public void setPublisherName(String publisherName) {
		this.publisherName = publisherName;
	}
	public String getPublisherAddress() {
		return publisherAddress;
	}
	public void setPublisherAddress(String publisherAddress) {
		this.publisherAddress = publisherAddress;
	}
	public String getPublisherEmail() {
		return publisherEmail;
	}
	public void setPublisherEmail(String publisherEmail) {
		this.publisherEmail = publisherEmail;
	}
	@Override
	public String toString() {
		return "Publisher [id=" + id + ", publisherName=" + publisherName + ", publisherAddress=" + publisherAddress
				+ ", publisherEmail=" + publisherEmail + "]";
	}
	

}
