package com.example.interviewPractice.other.sorting;

public class reverseLinkedList {
    public static void main(String[] args){
        Node ll = new Node(1);
        ll.next = new Node(2);
        ll.next.next = new Node(3);
        ll.next.next.next = new Node(6);
        ll.next.next.next.next = new Node(4);

        while(ll != null){
            System.out.println(ll.data);
        }
    }

    public static class Node{
        int data;
        Node next;

        Node(int newdata){
            data = newdata;
            next = null;
        }
    }
}
