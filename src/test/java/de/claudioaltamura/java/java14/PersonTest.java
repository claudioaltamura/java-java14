package de.claudioaltamura.java.java14;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PersonTest {

    @Test
    void test() {
        Person person = new Person("Peter", "Parker");

        assertEquals("Peter", person.firstName());
        assertEquals("Parker", person.lastName());
    }
}
