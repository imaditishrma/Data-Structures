package com.DemoLinkedList;

public class CDLL {
    private class Node {
        int data;
        Node prev;
        Node next;
        Node (int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // head and tail of the doubly linked list
    Node head = null;
    Node tail = null;
    int size = 0;

    // add node to the tail
    public void addAtTail(int data) {
        // create the new node
        Node newNode = new Node(data);

        if (size == 0) {
            head = tail = newNode;
            tail.next = head;
            head.prev = tail;
        } else {
            // rearrange the pointers
            tail.next = newNode;
            newNode.prev = tail;
            tail = newNode;
            newNode.next = head;
            tail.next = head;
        }
        size++;
    }

    // search() method will search a given data and will return the index
    public int search(int data) { // data instead val
        if (head == null) return -1;
        if (head.data == data) return 0;
        int index = 1;
        Node current = head.next;
        while (current != head) {
            if (current.data == data) {
                return index;
            }
            index++;
            current = current.next;
        }
        return -1;
    }

    // traverse() method will traverse the linked list from left to right
    public void traverse() {
        if (head == null) {
            System.out.println("Empty List.");
            return;
        }
        System.out.println(head.data);
        Node current = head.next;
        while (current != head) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // return node at a given index
    public Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // addAtHead() method will add node at the first
    public void addAtHead(int data) {
        Node newNode = new Node(data);
        if (size == 0) {
            head = tail = newNode;
            head.prev = tail;
            tail.next = head;
        } else {
            newNode.prev = tail;
            tail.next = newNode;
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // addAtIndex() mehtod will add node at the given index
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(data);
        } else if (index == size) {
            addAtTail(data);
        } else {
            Node newNode = new Node(data);
            Node prevNode = getNode(index - 1);
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = prevNode.next;
            prevNode.next.prev = newNode;
        }
        size++;
    }

    // print the nodes values
    public void print() {
        if (head == null) {
            System.out.println("Empty List.");
            return;
        }
        System.out.println(head.data);
        Node current = head.next;
        while (current != head) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    public static void main(String[] args) {
        CDLL linkedList = new CDLL();

        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        linkedList.addAtTail(6);
        // linkedList  = 1->2->3->4->5->6->null

        // Play with all the methods

        linkedList.print();
    }
}
