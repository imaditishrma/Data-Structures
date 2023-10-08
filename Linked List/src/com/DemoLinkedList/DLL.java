package com.DemoLinkedList;

public class DLL {

    // Node of the singly linked list
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
            head = newNode;
            tail = head;
        } else {
            // rearrange the pointers
            newNode.prev = tail;
            tail.next = newNode;
            tail = newNode;
        }
        size++;
    }

    // getNode() will return the node at a given index
    public Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    // deleteAtIndex(int index)
    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) return;
        if (index == 0) {
            head = head.next;
            head.prev = null;
        } else {
            Node prevNode = getNode(index - 1);
            prevNode.next = prevNode.next.next;
            if (prevNode.next.next != null) {
                prevNode.next.next.prev = prevNode;
            }
            if (size == index - 1) {
                tail = prevNode;
            }
        }
        size--;
    }

    // deleteEntireList() will delete the entire linked list
    public void deleteEntireList() {
        Node current = head;
        while (current != null) {
            Node tmp = current;
            current = current.next;
            tmp.next = null;
        }
        head = tail = null;
    }

    // traverse() will traverse linked list from left to right
    public void traverse() {
        if (head == null) {
            System.out.println("Empty list.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // search() will search and return index of a given node
    public int search(int data) {
        if (head == null) {
            return -1;
        }
        int index = 0;
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    // print the nodes values
    public void print() {
        if (head == null) {
            System.out.println("Empty List.");
            return;
        }
        Node current = head;
        while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }

    // addAtHead() method will add node at index 0
    public void addAtHead(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
        }
        size++;
    }

    // addAtIndex() will add a node at a given index
    public void addAtIndex(int index, int data) {
        if (index < 0 || index > size) return;
        if (index == 0) {
            addAtHead(data);
        } else if (index == size) {
            addAtTail(data);
        } else {
            Node newNode = new Node(data);
            Node prevNode = getNode(index - 1);
            prevNode.next.prev = newNode;
            prevNode.next = newNode;
            newNode.prev = prevNode;
            newNode.next = prevNode.next;
        }
        size++;
    }

    public static void main(String[] args) {
        DLL linkedList = new DLL();

        linkedList.addAtTail(1);
        linkedList.addAtTail(2);
        linkedList.addAtTail(3);
        linkedList.addAtTail(4);
        linkedList.addAtTail(5);
        linkedList.addAtTail(6);

        linkedList.print();
    }

}
