package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class HelloWorldTest {

    @Test
    void greetReturnsHelloWorld() {
        assertEquals("Hello, World!", HelloWorld.greet());
    }
}
