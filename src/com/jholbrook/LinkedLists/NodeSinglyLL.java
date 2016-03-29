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

}
