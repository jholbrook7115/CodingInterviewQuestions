package com.jholbrook.StackAndQueues;

import org.junit.Test;
import static org.junit.Assert.*;
public class QueueTest {

    @Test
    public void testInitialEnqueue(){
        Queue q = new Queue();
        q.enqueue("1st");
        Object expected = "1st";
        Object actual = q.first.data;

        assertEquals("The first element in the queue should have the data '1st'", expected, actual);
    }

    @Test
    public void testMultipleEnqueue(){
        Queue q = new Queue();
        q.enqueue("1st");
        q.enqueue("2nd");
        q.enqueue("3rd");

        Object expected = "1st";
        Object actual = q.first.data;

        assertEquals("The first element in the queue should have the data '1st'", expected, actual);

        Object expected1 = "3rd";
        Object actual1 = q.last.data;
        assertEquals("The last element should have the data '3rd'", expected1, actual1);
    }

    @Test
    public void testDequeue(){
        Queue q= new Queue();
        q.enqueue("1st");
        q.enqueue("2nd");
        q.enqueue("3rd");

        Object expected = "1st";
        Object actual = q.dequeue();

        assertEquals("1st dequeue should return '1st'", expected, actual);

        Object expected1 = "2nd";
        Object actual1 = q.dequeue();

        assertEquals("2nd dequeue should return '2nd'", expected1, actual1);

    }

}
