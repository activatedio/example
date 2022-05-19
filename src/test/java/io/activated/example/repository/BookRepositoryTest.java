package io.activated.example.repository;

import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import jakarta.inject.Inject;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest
public class BookRepositoryTest {

  @Inject
  private BookRepository unit;

  @Test
  public void findAll() {

    var got = unit.findAll().collectList().block();

    assertThat(got).isNotEmpty();
  }
}