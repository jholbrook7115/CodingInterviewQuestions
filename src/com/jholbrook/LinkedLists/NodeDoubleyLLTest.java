package com.jholbrook.LinkedLists;

//tests for java class NodeDoubleyLL
import org.junit.Test;
import static org.junit.Assert.*;

public class NodeDoubleyLLTest {

    @Test
    public void testInstantiateNode(){
        NodeDoubleyLL head = new NodeDoubleyLL(1);

        int expected = 1;
        int actual = (int)head.data;

        assertEquals("newly created head node should have int value 1", expected, actual);
    }

    @Test
    public void testAppendToTail(){
        NodeDoubleyLL head = new NodeDoubleyLL(1);
        head.appendToTail(2);
        head.appendToTail(3);


        int expected = 3;
        while(head.next != null){
            head = head.next;
        }
        int actual = (int)head.data;

        assertEquals("3rd node in the list shoudl have int value 3", expected, actual);
    }

    @Test
    public void testTraversal(){
        NodeDoubleyLL head = new NodeDoubleyLL(1);
        head.appendToTail(2);
        head.appendToTail(3);
        head.appendToTail(4);
        head.appendToTail(5);

        int expected1 = 4;
        for(int i = 0; i < 3; i++){
            head = head.next;
        }
        int actual1 = (int)head.data;

        assertEquals("third element in the list should have int value 3", expected1, actual1);

        int expected2 = 2;
        for(int i = 0; i < 2; i++){
            head = head.prev;
        }
        int actual2 = (int)head.data;
        assertEquals("second element in the list should have int value 2", expected2, actual2);
    }

}
