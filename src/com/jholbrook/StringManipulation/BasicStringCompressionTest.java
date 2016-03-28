package com.jholbrook.StringManipulation;

import org.junit.Test;
import static org.junit.Assert.*;

public class BasicStringCompressionTest {

    @Test
    public void testStringCompress() throws Exception {
        String expected = "a5";
        String actual = BasicStringCompression.stringCompress("aaaaa");

        assertEquals("String 'aaaaa' should return 'a5'", expected, actual);
    }

    @Test
    public void testStringCompressMultipleLetters() throws Exception{
        String expected = "a5b5c3";
        String actual = BasicStringCompression.stringCompress("aaaaabbbbbccc");

        assertEquals("String 'aaaaabbbbbccc' should return 'a5b5c3'", expected, actual);
    }

    @Test
    public void testStringCompressEmptyInput() throws Exception {
        String expected = "";
        String actual  = BasicStringCompression.stringCompress("");

        assertEquals("String '' should return ''", expected, actual);
    }

    @Test
    public void testStringCompressNoCompressionNeeded(){
        String expected = "abcd";
        String actual = BasicStringCompression.stringCompress("abcd");

        assertEquals("String 'abcd' does not need compression, should return 'abcd'", expected, actual);
    }
}