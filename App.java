package com.test.BookManagementSystem;

import java.time.LocalDate;
import java.time.Month;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import com.test.BookManagementSystem.Entity.Author;
import com.test.BookManagementSystem.Entity.Book;
import com.test.BookManagementSystem.Entity.Genre;
import com.test.BookManagementSystem.Entity.Publisher;



public class App 
{
    public static void main( String[] args )
    {
    	
    	SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		try 
		{
			Publisher publisher=new Publisher();
			publisher.setName("Penguin Classics");
			Publisher publisher1=new Publisher();
			publisher1.setName("Sterling");
			Publisher publisher2=new Publisher();
			publisher2.setName("Scribner");
			Publisher publisher3=new Publisher();
			publisher3.setName("Little,Brown and Company");
			Publisher publisher4=new Publisher();
			publisher4.setName("HarperCollins");
			Publisher publisher5=new Publisher();
			publisher5.setName("Signet Classics");
			
			
			Genre genre=new Genre();
			genre.setName("Mystery");
			Genre genre1=new Genre();
			genre1.setName("Science Fiction");
			Genre genre2=new Genre();
			genre2.setName("Romance");
			Genre genre3=new Genre();                      
			genre3.setName("Fantacy");
			Genre genre4=new Genre();
			genre4.setName("Technology");
			Genre genre5=new Genre();
			genre5.setName("Adventure");
			Genre genre6=new Genre();
			genre6.setName("Thriller");
			Genre genre7=new Genre();
			genre7.setName("Fiction");
			 
			
			
			Author author=new Author();
	        author.setName("Jane Doe");
	        Author author1=new Author();
	        author1.setName("John Smith");
	        Author author2=new Author();
	        author2.setName("Emily Johnson");
	        Author author3=new Author();
	        author3.setName("Michel Brown");
	        Author author4=new Author();
	        author4.setName("David Programmer");
	        Author author5=new Author();
	        author5.setName("Sarah J. Anderson");
	        Author author6=new Author();
	        author6.setName("James R.Thompson");
	        Author author7=new Author();
	        author7.setName("Jessica Davis");
	        Author author8=new Author();
	        author8.setName("Carlos Ruiz Zafon");
	        Author author9=new Author();
	        author9.setName("Dan Brown");
	        Author author10=new Author();
	        author10.setName("Jane Austen");
	       
	        
	        Book book1= new Book();
	        book1.setTitle("The Silent Garden");
	        book1.setISBN("978-1-234-56789");
	        book1.setPublicationDate(LocalDate.of(2020,Month.MAY,15));
	        book1.setAuthor(author);
	        book1.setGenre(genre);
	        book1.setPublisher(publisher);
	        
	        Book book2=new Book();
	        book2.setTitle("Beyond the Horizon");
	        book2.setISBN("978-0-876-54321");
	        book2.setPublicationDate(LocalDate.of(2019,Month.AUGUST,22));
	        book2.setAuthor(author1);
	        book2.setGenre(genre1);
	        book2.setPublisher(publisher1);
	        
	        
	        Book book3=new Book();
	        book3.setTitle("Whispers in the Wind");
	        book3.setISBN("978-3-210-98765");
	        book3.setPublicationDate(LocalDate.of(2021,Month.NOVEMBER,10));
	        book3.setAuthor(author2);
	        book3.setGenre(genre2);
	        book3.setPublisher(publisher);
	        
	        Book book4=new Book();
	        book4.setTitle("Echoes of Eternity");
	        book4.setISBN("978-5-432-10987");
	        book4.setPublicationDate(LocalDate.of(2022,Month.MARCH,30));
	        book4.setAuthor(author3);
	        book4.setGenre(genre3);
	        book4.setPublisher(publisher);
	        
	        Book book5=new Book();
	        book5.setTitle("The Art of Coding");
	        book5.setISBN("978-9-876-54321");
	        book5.setPublicationDate(LocalDate.of(2020,Month.JANUARY,05));
	        book5.setAuthor(author4);
	        book5.setGenre(genre4);
	        book5.setPublisher(publisher2);
	        
	        Book book6= new Book();
	        book6.setTitle("The Silent Echo");
	        book6.setISBN("978-1-234567-89");
	        book6.setPublicationDate(LocalDate.of(2021,Month.FEBRUARY,10));
	        book6.setAuthor(author5);
	        book6.setGenre(genre);
	        book6.setPublisher(publisher2);
	        
	        Book book7=new Book();
	        book7.setTitle("Eternal Serenade");
	        book7.setISBN("978-3-456789-12");
	        book7.setPublicationDate(LocalDate.of(2019,Month.NOVEMBER,5));
	        book7.setAuthor(author6);
	        book7.setGenre(genre3);
	        book7.setPublisher(publisher3);
	        
	        Book book8=new Book();
	        book8.setTitle("The Hidden Path");
	        book8.setISBN("978-9-012345-67");
	        book8.setPublicationDate(LocalDate.of(2022,Month.JUNE,17));
	        book8.setAuthor(author7);
	        book8.setGenre(genre5);
	        book8.setPublisher(publisher3);
	        
	        Book book9= new Book();
	        book9.setTitle("The Shadow of the Wind");
	        book9.setISBN("9780143034902");
	        book9.setPublicationDate(LocalDate.of(2001,Month.APRIL,12));
	        book9.setAuthor(author8);
	        book9.setGenre(genre);
	        book9.setPublisher(publisher4);
	        
	        Book book10=new Book();
	        book10.setTitle("The Angel's Game");
	        book10.setISBN("9780385733575");
	        book10.setPublicationDate(LocalDate.of(2008,Month.JUNE,17));
	        book10.setAuthor(author8);
	        book10.setGenre(genre);
	        book10.setPublisher(publisher4);
	        
	        Book book11=new Book();
	        book11.setTitle("The Da Vinci Code");
	        book11.setISBN("9780307474278");
	        book11.setPublicationDate(LocalDate.of(2003,Month.MARCH,18));
	        book11.setAuthor(author9);
	        book11.setGenre(genre6);
	        book11.setPublisher(publisher3);
	    
	        Book book12=new Book();
	        book12.setTitle("Angels & Demons");
	        book12.setISBN("9780743493468");
	        book12.setPublicationDate(LocalDate.of(2000,Month.MAY,23));
	        book12.setAuthor(author9);
	        book12.setGenre(genre6);
	        book12.setPublisher(publisher3);
	        
	        Book book13=new Book();
	        book13.setTitle("Pride and Prejudice");
	        book13.setISBN("9780141439518");
	        book13.setPublicationDate(LocalDate.of(1813,Month.JANUARY,28));
	        book13.setAuthor(author10);
	        book13.setGenre(genre2);
	        book13.setPublisher(publisher5);
	        
	        Book book14= new Book();
	        book14.setTitle("Sense and Sensibility");
	        book14.setISBN("9780141439662");
	        book14.setPublicationDate(LocalDate.of(1811,Month.OCTOBER,30));
	        book14.setAuthor(author10);
	        book14.setGenre(genre2);
	        book14.setPublisher(publisher5);
	        
	        Book book15=new Book();
	        book15.setTitle("The Awakening");
	        book15.setISBN("1234567890");
	        book15.setPublicationDate(LocalDate.of(2020,Month.MAY,15));
	        book15.setAuthor(author);
	        book15.setGenre(genre7);
	        book15.setPublisher(publisher3);
	        
	        Book book16=new Book();
	        book16.setTitle("Silent Whispers");
	        book16.setISBN("0987654321");
	        book16.setPublicationDate(LocalDate.of(2018,Month.FEBRUARY,20));
	        book16.setAuthor(author);
	        book16.setGenre(genre);
	        book16.setPublisher(publisher3);
	        
	        Book book17=new Book();
	        book17.setTitle("Eternal Shadows");
	        book17.setISBN("5678901234");
	        book17.setPublicationDate(LocalDate.of(2019,Month.AUGUST,10));
	        book17.setAuthor(author1);
	        book17.setGenre(genre3);
	        book17.setPublisher(publisher);
	        
	        Book book18= new Book();
	        book18.setTitle("The Sensibility");
	        book18.setISBN("9780141439662");
	        book18.setPublicationDate(LocalDate.of(1811,Month.OCTOBER,30));
	        book18.setAuthor(author1);
	        book18.setGenre(genre1);
	        book18.setPublisher(publisher);
	        
	        Book book19= new Book();
	        book19.setTitle("To Kill a Mockingbird");
	        book19.setISBN("9780141439661");
	        book19.setPublicationDate(LocalDate.of(1811,Month.OCTOBER,07));
	        book19.setAuthor(author4);
	        book19.setGenre(genre4);
	        book19.setPublisher(publisher4);
	        
	        Book book20=new Book();
	        book20.setTitle("Go Set a Watchman");
	        book20.setISBN("A32416789");
	        book20.setPublicationDate(LocalDate.of(2000,Month.SEPTEMBER, 02));
	        book20.setAuthor(author6);
	        book20.setGenre(genre7);
	        book20.setPublisher(publisher4);
	        
	        
	        author.getBooks().add(book1);
	        author1.getBooks().add(book2);
	        author2.getBooks().add(book3);
	        author3.getBooks().add(book4);
	        author4.getBooks().add(book5);
	        author5.getBooks().add(book6);
	        author6.getBooks().add(book7);
	        author7.getBooks().add(book8);
	        author8.getBooks().add(book9);
	        author8.getBooks().add(book10);
	        author9.getBooks().add(book11);
	        author9.getBooks().add(book12);
	        author10.getBooks().add(book13);
	        author10.getBooks().add(book14);
	        author.getBooks().add(book15);
	        author.getBooks().add(book16);
	        author1.getBooks().add(book17);
	        author1.getBooks().add(book18);
	        author4.getBooks().add(book19);  
	        author6.getBooks().add(book20);
	        
	        genre.getBooks().add(book1);
	        genre1.getBooks().add(book2);
	        genre2.getBooks().add(book3);
	        genre3.getBooks().add(book4);
	        genre4.getBooks().add(book5);
	        genre.getBooks().add(book6);
	        genre3.getBooks().add(book7);
	        genre5.getBooks().add(book8);
	        genre.getBooks().add(book9);
	        genre.getBooks().add(book10);
	        genre6.getBooks().add(book11);
	        genre6.getBooks().add(book12);
	        genre2.getBooks().add(book13);
	        genre2.getBooks().add(book14);
	        genre7.getBooks().add(book15);
	        genre.getBooks().add(book16);
	        genre3.getBooks().add(book17);
	        genre1.getBooks().add(book18);
	        genre4.getBooks().add(book19);
	        genre7.getBooks().add(book20);
	        
	        publisher.getBooks().add(book1);
	        publisher1.getBooks().add(book2);
	        publisher.getBooks().add(book3);
	        publisher.getBooks().add(book4);
	        publisher2.getBooks().add(book5);
	        publisher2.getBooks().add(book6);
	        publisher3.getBooks().add(book7);
	        publisher3.getBooks().add(book8);
	        publisher4.getBooks().add(book9);
	        publisher4.getBooks().add(book10);
	        publisher3.getBooks().add(book11);
	        publisher3.getBooks().add(book12);
	        publisher5.getBooks().add(book13);
	        publisher5.getBooks().add(book14);
	        publisher3.getBooks().add(book15);
	        publisher3.getBooks().add(book16);
	        publisher.getBooks().add(book17);
	        publisher.getBooks().add(book18);
	        publisher4.getBooks().add(book19);
	        publisher4.getBooks().add(book20);
	     
	        session.save(author);
	        session.save(author1);
	        session.save(author2);
	        session.save(author3);
	        session.save(author4);
	        session.save(author5);
	        session.save(author6);
	        session.save(author7);
	        session.save(author8);
	        session.save(author9);
	        session.save(author10);
	        
	        session.save(genre);
	        session.save(genre1);
	        session.save(genre2);
	        session.save(genre3);
	        session.save(genre4);
	        session.save(genre5);
	        session.save(genre6);
	        session.save(genre7);
	        
	        session.save(publisher);
	        session.save(publisher1);
	        session.save(publisher2);
	        session.save(publisher3);
	        session.save(publisher4);
	        session.save(publisher5);
	        
	        session.getTransaction().commit();
	        }
	        finally 
	        {
	        	session.close();
	        	sessionFactory.close();
	        }
    }
}
