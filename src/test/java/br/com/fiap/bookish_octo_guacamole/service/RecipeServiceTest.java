package br.com.fiap.bookish_octo_guacamole.service;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class RecipeServiceTest {
  @Test
  void primeiroTest() {
    assertEquals("guacamole", "guacamole");
  }

  @Test
  void segundoTest() {
    assertNotNull(getClass());
  }
}
