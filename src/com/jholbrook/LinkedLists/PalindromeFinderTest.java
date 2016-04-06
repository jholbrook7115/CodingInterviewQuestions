package com.jholbrook.LinkedLists;

//Test class for the PalindromeFinder class
import org.junit.Test;
import static org.junit.Assert.*;

public class PalindromeFinderTest {

    @Test
    public void testIsPalindromeFalse(){
        NodeSinglyLL head = new NodeSinglyLL('a');
        head.appendToTail('b');
        head.appendToTail('c');

        boolean expected = false;
        boolean actual = PalindromeFinder.isPalindrome(head);
        assertEquals("String 'abc' should evaluate as False (i.e. not a palindrome) ", expected, actual);
    }

    @Test
    public void testIsPalindromeTrue(){
        NodeSinglyLL head = new NodeSinglyLL('a');
        head.appendToTail('b');
        head.appendToTail('c');
        head.appendToTail('b');
        head.appendToTail('a');

        boolean expected = true;
        boolean actual = PalindromeFinder.isPalindrome(head);
        assertEquals("String 'abcba' should evaluate as True ", expected, actual);
    }





}
