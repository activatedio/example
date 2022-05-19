package io.activated.example.controller;

import io.activated.example.model.Book;
import io.activated.example.repository.BookRepository;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import jakarta.inject.Inject;
import reactor.core.publisher.Flux;

@Controller("/books")
public class BooksController {

  @Inject
  private BookRepository bookRepository;

  @Get
  public Flux<Book> getAll() {
    return bookRepository.findAll();
  }
}
