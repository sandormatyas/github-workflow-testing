package com.codecool.person;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PersonTest {

    @Test
    public void testIsNameNotNull() {
        Person john = new Person("John", 30);
        assertNotNull(john.getName());
    }

    @Test
    public void testIsAgeBelow0ThrowsException() {
        Person john = new Person();
        assertThrows(IllegalArgumentException.class, () -> {
            john.setAge(-10);
        });

    }
}