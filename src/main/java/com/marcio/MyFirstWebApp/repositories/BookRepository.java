package com.marcio.MyFirstWebApp.repositories;

import com.marcio.MyFirstWebApp.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}
