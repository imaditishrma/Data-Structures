package com.DemoLinkedList;

public class CSLL {

    // Node of the circular singly linked list
    private class Node {
        int data;
        Node next;
        Node (int data) {
            this.data = data;
            this.next = null;
        }
    }

    // head and tail of the linked list
    Node head = null;
    Node tail = null;
    int size = 0;

    // addAtHead() method will add node at the beginning
    public void addAtHead(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
        } else {
            newNode.next = head;
            tail.next = newNode;
            head = newNode;
        }
        size++;
    }

    // addAtTail() method will add node at the end
    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head == null) {
            head = tail = newNode;
            tail.next = head;
        } else {
            tail.next = newNode;
            newNode.next = head;
            tail = newNode;
        }
        size++;
    }

    //getNode()
    public Node getNode(int index) {
        Node current = head;
        for (int i = 0; i < index; i++)
            current = current.next;
        return current;
    }

    // addAtIndex() method will add node at a specific index
    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size) {
            return;
        }
        if (index == 0) {
            addAtHead(val);
        }
        else if (size == index) {
            addAtTail(val);
        }
        else {
            Node newNode = new Node(val);
            Node prevNode = getNode(index - 1);
            prevNode.next = newNode;
            newNode.next = prevNode.next.next;
        }
        size++;
    }

    // print() will the all the nodes present in the list
    public void print() {
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        // print the data of head node
        System.out.println(head.data);
        // initially current point will point to the first node
        Node current = head.next;
        while (current != head) {
            // print node and move current pointer to the next node
            System.out.println(current.data);
            current = current.next;
        }
    }

    // search() method will return the index of a given node
    public int search(int val) {
        if (head == null) {
            return - 1;
        }
        if (head.data == val) {
            return 0;
        }
        int index = 1;
        Node current = head.next;
        while (current != head) {
            if (current.data == val) {
                return index;
            }
            current = current.next;
            index++;
        }
        return -1;
    }

    public static void main(String[] args) {
        CSLL linkedList = new CSLL();

        linkedList.addAtHead(1);
        linkedList.addAtHead(2);
        linkedList.addAtTail(3);
        linkedList.addAtIndex(4, 3);
        linkedList.addAtHead(0);
        linkedList.addAtTail(5);
        linkedList.addAtIndex(7, 6);

        System.out.println("--------------");
        System.out.println(linkedList.search(3));
        System.out.println("--------------");

        // ll = 1->2->3->4->null
        linkedList.print();
		/* It will print 1 2 3 4 endlessly because of circle
		output: 1 2 3 4 ...*/
    }

}
