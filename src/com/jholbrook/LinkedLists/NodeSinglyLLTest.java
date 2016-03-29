package com.jholbrook.LinkedLists;

/*
    Test class for the NodeSinglyLL class
 */
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeSinglyLLTest {

    @Test
    public void testNodeCreate(){
        NodeSinglyLL testNode = new NodeSinglyLL(3);
        int expected = 3;
        int actual = testNode.data;

        assertEquals("new Node(3) should create a Node obj with data = 3", expected, actual);

    }

    @Test
    public void testAppendToTail(){
        NodeSinglyLL head = new NodeSinglyLL(1);

        head.appendToTail(2);
        head.appendToTail(3);

        NodeSinglyLL testNode = head;
        int i = 0;
        while(testNode.next != null) {
            i++;
            int expected = i;
            int actual = testNode.data;

            assertEquals("Head Node should have data = " + i, expected, actual);
            testNode = testNode.next;
        }
    }



}
