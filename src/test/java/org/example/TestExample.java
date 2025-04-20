package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestExample {

    @Test
    public void testInt() {
        Assertions.assertEquals(0, 0);
    }

    @Test
    public void testLong() {
        Assertions.assertEquals(0L, 0L);
    }

    @Test
    public void testString() {
        // given
        String expected = "Hello";

        // when
        String actual = "Hello World";

        // then
        Assertions.assertEquals(expected, actual);
    }
}
