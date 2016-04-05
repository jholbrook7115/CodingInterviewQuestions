package com.jholbrook.LinkedLists;

/*
    Check if the linked list is a palindrome

    Thoughts:
        do we need to find the length? maybe we can just find the middle!
 */

public class PalindromeFinder {

    private static NodeSinglyLL firstptr;
    private static NodeSinglyLL midptr;
    public static boolean isPalindrome(NodeSinglyLL head){
        firstptr = head;
        midptr = head;

        int midIndex;
        while(head.next.next != null){
            midptr = midptr.next;
            head = midptr.next.next;
        }
        boolean result = traverse(firstptr, 0);
        return result;
    }

    private static boolean traverse(NodeSinglyLL node, int index){

        return false;
    }
}
