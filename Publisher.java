package com.test.BookManagementSystem.Entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "publisher")
public class Publisher {
	@Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @Column(name = "publisher_id")
	 private Long publisherId;
	 @Column(name = "name")
	 private String name;
	 @OneToMany(mappedBy = "publisher", cascade = CascadeType.ALL)
	 private List<Book> books= new ArrayList<>();
	 // Getters and setters
	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Publisher(Long publisherId, String name, List<Book> books) {
		super();
		this.publisherId = publisherId;
		this.name = name;
		this.books = books;
	}
	public Long getPublisherId() {
		return publisherId;
	}
	public void setPublisherId(Long publisherId) {
		this.publisherId = publisherId;
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
		return "Publisher [publisherId=" + publisherId + ", name=" + name + ", books=" + books + "]";
	}
	 
	 

}
