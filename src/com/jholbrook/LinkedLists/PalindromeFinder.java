package com.jholbrook.LinkedLists;

/*
    Check if the linked list is a palindrome

    Thoughts:
        do we need to find the length? maybe we can just find the middle!
 */

public class PalindromeFinder {

    public static boolean isPalindrome(NodeSinglyLL head){
        boolean result = traverse(head, 0);
        return result;
    }

    private static boolean traverse(NodeSinglyLL node, int index){

        return false;
    }
}
