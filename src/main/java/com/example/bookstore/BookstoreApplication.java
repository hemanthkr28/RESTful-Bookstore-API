package com.example.bookstore;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import com.example.bookstore.entity.Author;
import com.example.bookstore.entity.Book;
import com.example.bookstore.repository.AuthorRepository;
import com.example.bookstore.repository.BookRepository;

@SpringBootApplication
public class BookstoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookstoreApplication.class, args);
	}

	// This CommandLineRunner is used to pre-populate the H2 database on startup
	@Bean
	CommandLineRunner initDatabase(AuthorRepository authorRepository, BookRepository bookRepository) {
		return args -> {
			// Create a few authors
			Author author1 = new Author();
			author1.setName("George Orwell");
			author1.setBiography("English novelist, essayist, journalist and critic.");
			authorRepository.save(author1);

			Author author2 = new Author();
			author2.setName("J.R.R. Tolkien");
			author2.setBiography("English writer, poet, philologist, and academic.");
			authorRepository.save(author2);

			// Create a few books and assign them to authors
			Book book1 = new Book();
			book1.setTitle("1984");
			book1.setIsbn("978-0451524935");
			book1.setPublicationYear(1949);
			book1.setAuthor(author1);
			bookRepository.save(book1);

			Book book2 = new Book();
			book2.setTitle("Animal Farm");
			book2.setIsbn("978-0451526342");
			book2.setPublicationYear(1945);
			book2.setAuthor(author1);
			bookRepository.save(book2);

			Book book3 = new Book();
			book3.setTitle("The Hobbit");
			book3.setIsbn("978-0547928227");
			book3.setPublicationYear(1937);
			book3.setAuthor(author2);
			bookRepository.save(book3);
		};
	}
}
