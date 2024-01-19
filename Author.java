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
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "author_id")
    private Long authorId;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
    private List<Book> books= new ArrayList<>();
	public Author() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Author(Long authorId, String name, List<Book> books) {
		super();
		this.authorId = authorId;
		this.name = name;
		this.books = books;
	}
	public Long getAuthorId() {
		return authorId;
	}
	public void setAuthorId(Long authorId) {
		this.authorId = authorId;
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
		return "Author [authorId=" + authorId + ", name=" + name + ", books=" + books + "]";
	}
	 
    
}
