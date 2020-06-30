package de.claudioaltamura.java.java14;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PatternMatchingExampleTest {

  @Test
  void string() {
    PatternMatchingExample example = new PatternMatchingExample();

    assertEquals("HELLO", example.toUppercase("hello"));
  }

  @Test
  void nonString() {
    PatternMatchingExample example = new PatternMatchingExample();

    assertEquals("", example.toUppercase(42));
  }

}
