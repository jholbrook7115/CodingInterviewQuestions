package com.jholbroook.StringManipulation;

/*
    Cracking the Coding Interview 5th Edition
    Chapter 1: Arrays and Strings
    Question: 1.5
    Description: Implement a method to perform basic string compression using the counts of repeated characters.
    For example, the string aabcccccaaa would become a2b1c5a3.  If the "compressed" string would not become smaller
    than the original string, your method should return the original string.

    Immediate issues:
        - String are immutable in Java. Will have to return a new string instead of modifying the old one in place.
            Can I work around this to increase space efficiency?
                I don't think so, not without increase compute time significantly... Probably not worth it


    Possible Solutions:
        - (simple): go through and keep a count of the repeating elements.  Then once you find a different character
            replace the repeated letters with <repeating-letter><number-of-times-it-appears>

    Test conditions:
        Input: "aaaaa" Output: "a5"
        Input: "aaaaabbbbbccc" Output: "a5b5c3"
 */

class BasicStringCompression {

    static String stringCompress(String str){
        if(str.length()==0){
            return "";
        }

        StringBuilder sb = new StringBuilder();

        int count = 0;
        char letter = str.charAt(0);
        for(int i = 0; i <=  str.length(); i++) {
            if(i == str.length()){
                sb.append(letter).append(count);
                break;
            }
            if (letter != str.charAt(i) || i == str.length()) {
                sb.append(letter).append(count);


                letter = str.charAt(i);
                count = 0;
            }
            count++;
        }
        if(str.length() < sb.length()){
            return str;
        }
        return sb.toString();
    }
}
