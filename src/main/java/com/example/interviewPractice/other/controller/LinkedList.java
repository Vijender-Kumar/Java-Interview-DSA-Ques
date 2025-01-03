package com.example.interviewPractice.other.controller;

public class LinkedList {
    Node head;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.printList();
//        System.out.println();
        ll.addFirst("is");
        ll.addFirst("This");
        ll.addLast("Linked");
        ll.addLast("List");
        ll.printList();
        System.out.println();
//        ll.head = ll.reverse(ll.head);
//        ll.printList();
//        System.out.println();
        ll.deleteFirst();
        ll.printList();
        System.out.println();
        ll.deleteLast();
        ll.printList();
        System.out.println();
    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
        }
    }

    public void addFirst(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;

    }

    public void addLast(String data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        Node currNode = head;
        while(currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }

        Node currNode = head;
        while(currNode != null){
            System.out.print(currNode.data + " -> ");
            currNode = currNode.next;
        }
        System.out.print("NULL");
    }

    public Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node next;

        while(curr != null){
            next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public void deleteFirst(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        if(head.next == null){
            head = null;
            return;
        }
        Node sL = head;
        Node lN = head.next;

        while(lN.next != null){
            sL = sL.next;
            lN = lN.next;
        }
        sL.next = null;
    }
}
