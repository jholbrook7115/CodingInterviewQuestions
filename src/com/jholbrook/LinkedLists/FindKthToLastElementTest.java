package com.jholbrook.LinkedLists;
//Unit tests for the "FindKthToLastElement" class
import static org.junit.Assert.*;
import org.junit.Test;

public class FindKthToLastElementTest {

    @Test
    public void testNodeCreate(){
        Node testNode = new Node(3);
        int expected = 3;
        int actual = testNode.data;

        assertEquals("new Node(3) should create a Node obj with data = 3", expected, actual);

    }

    @Test
    public void testNodeAppendToTail(){
        Node head = new Node(1);

        head.appendToTail(2);
        head.appendToTail(3);

        Node testNode = head;
        int i = 0;
        while(testNode.next != null) {
            i++;
            int expected = i;
            int actual = testNode.data;

            assertEquals("Head Node should have data = " + i, expected, actual);
            testNode = testNode.next;
        }
    }

    @Test
    public void testFindKthToLastElement(){
        //create Linked List to test with; values input to Nodes are seqentially in order from 0 to ____
        Node head = new Node(0);
        for(int i = 1; i < 10; i++){
            head.appendToTail(i);
        }
        int k = 4;
        int expected = 6;
        int actual = FindKthToLastElement.findKthToLastElement(head, k).data;
        assertEquals("the 4 to last Node should be teh 6th Node, given a 10-length Linked List", expected, actual);
    }

    @Test
    public void testFindKthToLastElement_kGreaterThanLength(){
        Node head = new Node(0);
        head.appendToTail(1);
        Node expected = null;
        Node actual = FindKthToLastElement.findKthToLastElement(head, 3);

        assertEquals("finding the second to last element in a Linked List of only two items should return null", expected, actual);
    }

    @Test
    public void testFindKthToLastElement_kEqualToZero(){
        Node head = new Node(0);
        head.appendToTail(1);
        Node expected = null;
        Node actual = FindKthToLastElement.findKthToLastElement(head, 0);

        assertEquals("input k equal to Zero should return null because 0th-to-last is the last element in the " +
                "Linked list plus one (which is null)", expected, actual);
    }

}