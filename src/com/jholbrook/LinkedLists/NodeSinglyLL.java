package com.jholbrook.LinkedLists;

/*
    This is a full-sized implementation of a node in a singly-linked list including:
        - appending to tail
        - inserting new nodes before specified index

 */
public class NodeSinglyLL {

    public int data;
    public NodeSinglyLL next;
    public String str;
    public char ch;

    public NodeSinglyLL(int data){
        this.data = data;
        this.next = null;
    }

    public NodeSinglyLL(char ch){
        this.ch = ch;
    }

    public void appendToTail(int data){
        NodeSinglyLL head = this;
        NodeSinglyLL newNode = new NodeSinglyLL(data);

        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
    }

    public void appendToTail(char ch){
        NodeSinglyLL head = this;
        NodeSinglyLL newNode = new NodeSinglyLL(ch);

        while(head.next != null){
            head = head.next;
        }
        head.next = newNode;
    }

    /*
        inserts the new node before the index given, assuming a zero-bounded index
        Example: insertBefore(2, 5) would change
            [1]->[2]->[3]->[4]
            into
            [1]->[2]->[5]->[3]->[4]
     */
    public void insertBefore(int index, int data){
        NodeSinglyLL head = this;
        NodeSinglyLL newNode = new NodeSinglyLL(data);

        for(int i = 1; i < index; i++){
            head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
    }
    //insertBefore but with a node as input
    public void insertBefore(int index, NodeSinglyLL newNode){
        NodeSinglyLL head = this;

        for(int i = 1; i < index; i++){
            head = head.next;
        }
        newNode.next = head.next;
        head.next = newNode;
    }

    //accepts an array of integers to insert before the index given
    public void insertBefore(int index, int[] data){
        if(data.length <= 0){
            return;
        }
        NodeSinglyLL head = this;
        //create a new linked list from the new array of data
        NodeSinglyLL subHead = new NodeSinglyLL(data[0]);
        for(int i = 1; i< data.length; i++ ){
            subHead.appendToTail(data[i]);
        }
        NodeSinglyLL subTail = subHead;
        while(subTail.next != null){
            subTail = subTail.next;
        }

        for(int i = 1; i < index; i++){
            head = head.next;
        }
        subTail.next = head.next;
        head.next = subHead;
    }
}
