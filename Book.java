// Book.java
package com.test.BookManagementSystem.Entity;
import java.time.LocalDate;
import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
@Column(name = "title")
private String title;
@Column(name = "ISBN")
private String ISBN;
@Column(name = "publication_date")
private LocalDate publicationDate;

@ManyToOne
@JoinColumn(name = "author_id")
private Author author;

@ManyToOne
@JoinColumn(name = "genre_id")
private Genre genre;

@ManyToOne
@JoinColumn(name = "publisher_id")
private Publisher publisher;
// Getters and setters

public Book() {
	super();
	// TODO Auto-generated constructor stub
}
public Book(Long id, String title, String iSBN, LocalDate publicationDate, Author author, Genre genre, Publisher publisher) {
	super();
	this.id = id;
	this.title = title;
	ISBN = iSBN;
	this.publicationDate = publicationDate;
	this.author = author;
	this.genre = genre;
	this.publisher = publisher;
}
public Long getId() {
	return id;
}
public void setId(Long id) {
	this.id = id;
}
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}
public LocalDate getPublicationDate() {
	return publicationDate;
}
public void setPublicationDate(LocalDate publicationDate) {
	this.publicationDate = publicationDate;
}
public Author getAuthor() {
	return author;
}
public void setAuthor(Author author) {
	this.author = author;
}
public Genre getGenre() {
	return genre;
}
public void setGenre(Genre genre) {
	this.genre = genre;
}
public Publisher getPublisher() {
	return publisher;
}
public void setPublisher(Publisher publisher) {
	this.publisher = publisher;
}
@Override
public String toString() {
	return "Book [id=" + id + ", title=" + title + ", ISBN=" + ISBN + ", publicationDate=" + publicationDate
			+ ", author=" + author + ", genre=" + genre + ", publisher=" + publisher + " ]";
}



	    }
