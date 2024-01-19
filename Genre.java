//Genre.java
package com.test.BookManagementSystem.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {
 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 @Column(name = "genre_id")
 private Long genreId;
 @Column(name = "name")
 private String name;
 @OneToMany(mappedBy = "genre", cascade = CascadeType.ALL)
 private List<Book> books= new ArrayList<>();
 // Getters and setters
public Genre() {
	super();
	// TODO Auto-generated constructor stub
}
public Genre(Long genreId, String name, List<Book> books) {
	super();
	this.genreId = genreId;
	this.name = name;
	this.books = books;
}
public Long getGenreId() {
	return genreId;
}
public void setGenreId(Long genreId) {
	this.genreId = genreId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;
}
@Override
public String toString() {
	return "Genre [genreId=" + genreId + ", name=" + name + ", books=" + books + "]";
}
 


 
}

