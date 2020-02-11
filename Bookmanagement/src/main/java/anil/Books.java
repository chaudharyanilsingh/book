package anil;

import java.util.*;
import java.util.*;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
public class Books 
{
	private String Tittle;
	private String Author;
	@Id
	private int Isbn;
	private String Publisher;
	
    private String PublishDate;
	private String Category;
	private int NumberOfBooks;
	public Books() {
		super();
	}
	public Books(String tittle, String author, int isbn, String publisher, String publishDate, String category,
			int numberOfBooks) {
		super();
		Tittle = tittle;
		Author = author;
		Isbn = isbn;
		Publisher = publisher;
		PublishDate = publishDate;
		Category = category;
		NumberOfBooks = numberOfBooks;
	}

	public String getTittle() {
		return Tittle;
	}
	public void setTittle(String tittle) {
		Tittle = tittle;
	}
	public String getAuthor() {
		return Author;
	}
	public void setAuthor(String author) {
		Author = author;
	}
	public int getIsbn() {
		return Isbn;
	}
	public void setIsbn(int isbn) {
		Isbn = isbn;
	}
	public String getPublisher() {
		return Publisher;
	}
	public void setPublisher(String publisher) {
		Publisher = publisher;
	}
	public String getPublishDate() {
		return PublishDate;
	}
	public void setPublishDate(String publishDate) {
		PublishDate = publishDate;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public int getNumberOfBooks() {
		return NumberOfBooks;
	}
	public void setNumberOfBooks(int numberOfBooks) {
		NumberOfBooks = numberOfBooks;
	}
	@Override
	public String toString() {
		return "Books [Tittle=" + Tittle + ", Author=" + Author + ", Isbn=" + Isbn + ", Publisher=" + Publisher
				+ ", PublishDate=" + PublishDate + ", Category=" + Category + ", NumberOfBooks=" + NumberOfBooks + "]";
	}
	
}
