package com.DemoLinkedList;

//Reverse a singly linked list by iterative method
public class ReversedList_Iteration {

    int reverse(int head){
        prev=null;
        curr=head;
        tmp=null;
        while(curr!=null){
            tmp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=tmp;
        }
        return prev;
    }
}
