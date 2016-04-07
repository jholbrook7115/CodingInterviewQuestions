package com.jholbrook.StackAndQueues;

import com.jholbrook.LinkedLists.NodeDoubleyLL;


public class Queue {
    NodeDoubleyLL first, last;

    public void enqueue(Object item){
        if(first == null){
            last = new NodeDoubleyLL(item);
            first = last;
        } else {
            last.next = new NodeDoubleyLL(item);
            last = last.next;
        }
    }

    public Object dequeue(){
        if(first != null){
            Object item = first.data;
            first = first.next;
            return item;
        } else {
            return null;
        }
    }

}
