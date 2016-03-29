package com.jholbrook.LinkedLists;

/*
    Cracking the Coding Interview 5th Edition
    Chapter 2: Linked Lists
    Question: 2.2
    Description: Implement an Algorithm to find the k-th to last element of a singly-linked list.

    Approach:
        First Thoughts:
            find the length of the linked list and then, using the length, loop through it again length - k times
            Realistic runtime is ~2n where n is length of the linked list
             Worst-Case is O(n)

        Better Solution:
            - use two pointers
            - We can increment both of them in a single while loop
            - Before loop-counter == input k, only iterate with the "end pointer"
            - When loop-counter == input k, increment both pointers
            - Once the end pointer finds the end of the linked list, your other pointer will be pointing at the kth
              to last element in linked list
            Realistic runtime is ~n where n i slength of the linked list
            Worst-case is O(n)
 */

class FindKthToLastElement {

    static Node findKthToLastElement(Node node, int k) {
        if(k == 0 || node == null){
            return null;
        }

        int i = 1;
        Node n = node;
        while (n.next != null) {
            n = n.next;
            if (i == k) {
                node = node.next;
            } else {
                i++;
            }
        }
        if (i < k) {
            return null;
        } else {
            return node;
        }
    }
}
class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        next = null;
    }

    void appendToTail(int data){
        Node tailNode = new Node(data);
        Node n = this;
        while (n.next != null) {
            n = n.next;
        }
        n.next = tailNode;
    }



}
