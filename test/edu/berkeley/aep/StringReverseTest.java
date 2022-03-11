package edu.berkeley.aep;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverseTest {

    @Test
    public void reverseEmptyString() {
        var emptyString = new StringReverse();
        assertEquals("", emptyString.reverse(""));
    }

    @Test
    public void reverseOneLetterString() {
        var oneLetterString = new StringReverse();
        assertEquals("a", oneLetterString.reverse("a"));
    }

    @Test
    public void reverseTwoLetterString() {
        var twoLetterString = new StringReverse();
        assertEquals("ba", twoLetterString.reverse("ab"));
    }

    @Test
    public void reverseFourLetterString() {
        var fourLetterString = new StringReverse();
        assertEquals("dcba", fourLetterString.reverse("abcd"));
    }
}
