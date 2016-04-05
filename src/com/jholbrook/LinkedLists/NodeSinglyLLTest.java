package com.jholbrook.LinkedLists;

/*
    Test class for the NodeSinglyLL class
 */
import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.ExpectedException;

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

    @Test
    public void testInsertBefore_int(){
        NodeSinglyLL head = new NodeSinglyLL(1);

        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        head.insertBefore(2, 5);

        int expected = 5;
        int actual = head.next.next.data;
        assertEquals("3rd item (index==2) in the linked list should have the value 5", expected, actual);
    }

    @Test
    public void testInsertBefore_Node(){
        NodeSinglyLL head = new NodeSinglyLL(1);

        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        NodeSinglyLL newNode = new NodeSinglyLL(5);

        head.insertBefore(2, newNode);

        int expected = newNode.data;
        int actual = head.next.next.data;
        assertEquals("3rd item (index==2) in the linked list should have the value 5", expected, actual);
    }

    @Test
    public void testInsertBefore_intArray(){
        NodeSinglyLL head = new NodeSinglyLL(1);
        NodeSinglyLL testHead = head;
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);

        int index = 2;
        int[] newNodesData = {5, 6, 7, 8, 9};
        head.insertBefore(index, newNodesData);

        for(int i = 0; i < index; i++){
            testHead = testHead.next;
        }

        for(int i = 0; i < newNodesData.length; i++){
            int expected = newNodesData[i];
            int actual = testHead.data;
            assertEquals("value of data at index " + (index+i) + " should be " + newNodesData[i], expected, actual);
            testHead = testHead.next;
        }

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    //This test should return an exception or it will not pass
    @Test
    public void testInsertBefore_invalidIndex() throws NullPointerException{
        NodeSinglyLL head = new NodeSinglyLL(1);
        head.appendToTail(2);
        thrown.expect(NullPointerException.class);
        head.insertBefore(3, 6);
    }

    @Test
    public void testCreateNodeWithChar(){
        NodeSinglyLL head = new NodeSinglyLL('a');

        char expected = 'a';
        char actual = head.ch;
        assertEquals("value of data at index 0 should equal 'a' " , expected, actual);

    }

    @Test
    public void testAppendNodeWithChar(){
        NodeSinglyLL head = new NodeSinglyLL('a');
        head.appendToTail('b');
        head.appendToTail('c');

        char[] expected = {'a', 'b', 'c'};
        char[] actual = {head.ch, head.next.ch, head.next.next.ch};
        for(int i = 0; i < 3; i++) {
            assertEquals("value of data at index" + i + "should equal " + expected[i], expected[i], actual[i]);
        }
    }
}
