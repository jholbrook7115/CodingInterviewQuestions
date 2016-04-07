package com.jholbrook.LinkedLists;


public class NodeDoubleyLL {

    public Object data;
    //public int data;
    public NodeDoubleyLL next;
    public NodeDoubleyLL prev;
    public String str;
    public char ch;

    public NodeDoubleyLL(int data){
        this.data = data;
        this.next = null;
        this.prev = null;
    }

    public NodeDoubleyLL(Object item){

        this.data = item;
        this.next = null;
        this.prev = null;
    }

    public void appendToTail(int data){
        NodeDoubleyLL head = this;
        NodeDoubleyLL newNode = new NodeDoubleyLL(data);

        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
        newNode.prev = head;
    }

    public void appendToTail(Object item){
        NodeDoubleyLL head = this;
        NodeDoubleyLL newNode = new NodeDoubleyLL(item);

        while(head.next != null){
            head = head.next;
        }

        head.next = newNode;
        newNode.prev = head;
    }
}
