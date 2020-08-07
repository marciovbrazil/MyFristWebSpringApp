package com.marcio.MyFirstWebApp.bootstrap;

import com.marcio.MyFirstWebApp.domain.Author;
import com.marcio.MyFirstWebApp.domain.Book;
import com.marcio.MyFirstWebApp.domain.Publisher;
import com.marcio.MyFirstWebApp.repositories.AuthorRepository;
import com.marcio.MyFirstWebApp.repositories.BookRepository;
import com.marcio.MyFirstWebApp.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class BootStrapData implements CommandLineRunner {

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        Author eric = new Author("Eric", "Evans");
        Book ddd = new Book("xxx", "123");

        eric.getBooks().add(ddd);
        ddd.getAuthors().add(eric);

        authorRepository.save(eric);
        bookRepository.save(ddd);

        Author rod = new Author("Rod", "Jonson");
        Book ggg = new Book("yyyy", "343");

        rod.getBooks().add(ggg);
        ggg.getAuthors().add(rod);

        authorRepository.save(rod);
        bookRepository.save(ggg);

        Publisher ebooks = new Publisher("Ebooks", "rua das flores", "Gravatai", "RS", "9400000");

        publisherRepository.save(ebooks);

        System.out.println("Started in BootSrtrap");
        System.out.println("Number of books: " + bookRepository.count());
        System.out.println("Number of Pulisher: " + publisherRepository.count());


    }
}
