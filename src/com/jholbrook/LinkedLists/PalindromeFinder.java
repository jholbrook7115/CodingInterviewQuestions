package com.jholbrook.LinkedLists;

/*
    Check if the linked list is a palindrome

    Thoughts:
        do we need to find the length? maybe we can just find the middle!
 */

public class PalindromeFinder {

    private static NodeSinglyLL firstPtr;
    //private static NodeSinglyLL midptr;
    public static boolean isPalindrome(NodeSinglyLL head){
        firstPtr = head;
        NodeSinglyLL midPtr = head;

        int midIndex;
        while(head.next.next != null){
            midPtr = midPtr.next;
            head = head.next.next;
        }
        //test for one last node in the list
        if(head.next != null){
            head = head.next;
            midPtr = midPtr.next;
        }

        boolean result = traverse(midPtr, 0);
        return result;
    }

    private static boolean traverse(NodeSinglyLL midPtr, int index){
        while(midPtr.next != null){
            if(midPtr.ch == firstPtr.ch){

            }
        }
        return false;
    }
}
