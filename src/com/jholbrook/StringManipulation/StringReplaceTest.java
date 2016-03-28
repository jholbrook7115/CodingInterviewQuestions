package com.jholbrook.StringManipulation;

//Test class for the StringReplace Class
import org.junit.Test;

import static org.junit.Assert.*;

public class StringReplaceTest {
    @Test
    public void testIfSpacesReplaced() throws Exception {
        char[] testInput = ("This is a test      ").toCharArray();
        //char[] expected = {'T', 'h', 'i', 's', '%', '2', '0', 'i', 's','%', '2', '0', 'a', '%', '2', '0', 't', 'e', 's', 't'};
        char[] expected = ("This%20is%20a%20test").toCharArray();
        assertArrayEquals("Method should replace all spaces with '%20'", expected,
                StringReplace.replaceSpaces(testInput));
    }
    @Test
    public void testStringReplaceForTrailingSpace() throws Exception {
        char[] testInput = ("Test the edge case         ").toCharArray();
        char[] expected = ("Test%20the%20edge%20case%20").toCharArray();
        assertArrayEquals("Method handle trailing spaces properly", expected,
                StringReplace.replaceSpaces(testInput));
    }

    @Test
    public void testStrignReplaceHandleBlankInput() throws Exception{
        char[] testInput = {};
        char[] expected = {};
        assertArrayEquals("StringReplace should accept a blank char[] and return an empty char[]",
                expected, StringReplace.replaceSpaces(testInput));
    }

}
