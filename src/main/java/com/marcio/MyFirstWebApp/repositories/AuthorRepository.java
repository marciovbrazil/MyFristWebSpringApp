package com.marcio.MyFirstWebApp.repositories;

import com.marcio.MyFirstWebApp.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author, Long> {
}
