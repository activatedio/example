package io.activated.example.repository;

import io.activated.example.model.Book;
import io.micronaut.data.annotation.Repository;
import io.micronaut.data.repository.reactive.ReactorCrudRepository;

@Repository
public interface BookRepository extends ReactorCrudRepository<Book, Long> {
}
