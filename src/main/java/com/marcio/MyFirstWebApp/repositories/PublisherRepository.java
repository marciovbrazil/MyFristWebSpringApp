package com.marcio.MyFirstWebApp.repositories;

import com.marcio.MyFirstWebApp.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
}
