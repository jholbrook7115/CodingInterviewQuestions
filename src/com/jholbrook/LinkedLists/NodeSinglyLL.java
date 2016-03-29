package com.jholbrook.LinkedLists;

/*
    This is a full-sized implementation of a node in a singly-linked list including:
        - appending to tail

 */
public class NodeSinglyLL {

    public int data;
    public NodeSinglyLL next;
    public NodeSinglyLL(int data){
        this.data = data;
        this.next = null;
    }

    public void appendToTail(int data){
        NodeSinglyLL head = this;
        NodeSinglyLL newNode = new NodeSinglyLL(data);

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
    //insertBefore but with existing Nodes
//    public void insertBefore(int index, int data){
//        NodeSinglyLL head = this;
//        NodeSinglyLL newNode = new NodeSinglyLL(data);
//
//        for(int i = 1; i < index; i++){
//            head = head.next;
//        }
//        newNode.next = head.next;
//        head.next = newNode.next;
//    }
}
