package com.book.db.entity;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
@Entity
public class Books 
{
	@Id
	private int id;
	private String tittle;
	@ManyToOne(cascade= {CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="author_id")
    private Author author;
	private int isbn;
	@ManyToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="publisher_id")
	private Publisher publisher;
    private String publishDate;
	@OneToOne(cascade={CascadeType.PERSIST,CascadeType.MERGE})
	@JoinColumn(name="category_id")
	private Category category;
	private int numberOfBooks;
	public Books() {
		super();
	}
	

	public Publisher getPublisher() {
		return publisher;
	}
	public void setPublisher(Publisher publisherdetail) {
		publisher = publisherdetail;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}


	public Author getAuthor() {
		return author;
	}


	public void setAuthor(Author author) {
		this.author = author;
	}




	public String getTittle() {
		return tittle;
	}


	public void setTittle(String tittle) {
		this.tittle = tittle;
	}


	public int getIsbn() {
		return isbn;
	}


	public void setIsbn(int isbn) {
		this.isbn = isbn;
	}


	public String getPublishDate() {
		return publishDate;
	}


	public void setPublishDate(String publishDate) {
		this.publishDate = publishDate;
	}


	public int getNumberOfBooks() {
		return numberOfBooks;
	}


	public void setNumberOfBooks(int numberOfBooks) {
		this.numberOfBooks = numberOfBooks;
	}


	@Override
	public String toString() {
		return "Books [id=" + id + ", tittle=" + tittle + ", author=" + author + ", isbn=" + isbn + ", publisher="
				+ publisher + ", publishDate=" + publishDate + ", Category=" + category + ", numberOfBooks="
				+ numberOfBooks + "]";
	}


	public Category getCategory() {
		return category;
	}


	public void setCategory(Category category) {
		this.category = category;
	}


	
}
