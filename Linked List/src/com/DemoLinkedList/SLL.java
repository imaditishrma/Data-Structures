package com.DemoLinkedList;

public class SLL {

    //Node of a singly linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    //head and tail of a singly linked list
    Node head = null;
    Node tail = null;
    int size = 0;

    //to add a new node at the head of the linked list
    void AddAtHead(int data) {
        Node node = new Node(data);
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
        Node node = new Node(data);
        if (size == 0)
            head = tail = node;
        else {
            tail.next = node;
            tail = node;
        }
        size++;
    }

    private Node getNode(int index) {
        Node p = head;
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
            Node prevNode = getNode(index - 1);
            Node node = new Node(data);
            node.next = prevNode.next;
            prevNode.next = node;
            size++;
        }
    }

    //to search a node with given value in the linked list
    public int search(int val) {
        if (head == null) return -1;
        Node current = head;
        int index = 0;
        while (current != null) {
            if (current.data == val) return index;
            index++;
            current = current.next;
        }
        return -1;
    }

    //to delete a node at a specific index
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        if (index == 0) {
            head = head.next;
        } else {
            Node prevNode = getNode(index - 1);
            prevNode.next = prevNode.next.next;
            if (index == size - 1) {
                tail = prevNode;
            }
        }
        size--;
    }

    //to delete an entire list
    public void deleteEntireList() {
        head = tail = null;
    }

    //to print all the nodes present in the list
    public void print() {
        Node current = head;
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        System.out.println("Nodes of the singly linked list:");
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main (String[]args){
        SLL linkedList = new SLL();

        // Add 1, 2, 3, 4 nodes to the linked List
        linkedList.AddAtHead(2);
        linkedList.AddAtHead(1);
        linkedList.AddAtHead(0);
        linkedList.AddAtIndex(3, 3);
        linkedList.AddAtIndex(4, 4);
        linkedList.AddAtTail(5);
        linkedList.print();
        /* 0->1->2->3->4->5->null */
        // linkedList = 0->1->2->3->4->5->null

        // Delete a specific node
        linkedList.deleteAtIndex(3);
        linkedList.print();
        // output: 0 1 2 4 5

        //search operation for val=5
        System.out.println("After running search operation for val=5: ");
        int x= linkedList.search(5);
        System.out.println(x);

        System.out.println("After running deleteEntireList() operation:");
        // linkedList = 0->1->2->3->4->5->null
        linkedList.deleteEntireList();
        // after deletion, linkedList = null
        linkedList.print();
        // output: Linked List is Empty.
    }
}