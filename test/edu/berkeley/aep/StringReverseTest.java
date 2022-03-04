package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {

    @Test
    public void reverseEmptyString() {
        var emptyString = new reverseEmpty("");
        assertEquals("", emptyString.reverse());
    }

    @Test
    public void reverseOneLetterString() {
        var emptyString = new reverseEmpty("a");
        assertEquals("a", emptyString.reverse());
    }

    @Test
    public void reverseTwoLetterString() {
        var emptyString = new reverseEmpty("ab");
        assertEquals("ba", emptyString.reverse());
    }
}
