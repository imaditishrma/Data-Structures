package com.DemoLinkedList;

//Reverse a singly linked list by recursive method
public class ReversedList_Recursion {

    //Node of a singly linked list
    class Node {
        int data;
        SLL.Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //head and tail of a singly linked list
    SLL.Node head = null;
    SLL.Node tail = null;
    int size = 0;

    //to add a new node at the head of the linked list
    void AddAtHead(int data) {
        SLL.Node node = new SLL.Node(data);
        if (size == 0)
            head = tail = node;
        else {
            node.next = head;
            head = node;
        }
        size++;
    }

    //to add a new node at the tail of the linked list
    void AddAtTail(int data) {
        SLL.Node node = new SLL.Node(data);
        if (size == 0)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    private SLL.Node getNode(int index) {
        SLL.Node p = head;
        for (int i = 0; i < index; ++i)
            p = p.next;
        return p;
    }

    //to add at given index
    void AddAtIndex(int data, int index) {
        if ((index < 0) || (index > size))
            return;
        if (index == 0)
            AddAtHead(data);
        else if (index == size)
            AddAtTail(data);
        else {
            SLL.Node prevNode = getNode(index - 1);
            SLL.Node node = new SLL.Node(data);
            node.next = prevNode.next;
            prevNode.next = node;
            size++;
        }
    }

}
