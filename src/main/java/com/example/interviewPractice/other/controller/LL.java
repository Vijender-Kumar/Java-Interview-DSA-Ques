package com.example.interviewPractice.other.controller;

public class LL {
    Node head;

    public static void main(String[] args) {
        LL ls = new LL();
        ls.addLast("Linked");
        ls.addLast("List");
        ls.addFirst("is");
        ls.addFirst("This");
        ls.printList();
        System.out.println();
//        ls.deleteFirst();
//        ls.deleteLast();
        ls.head = ls.reverse(ls.head);
        ls.printList();
        System.out.println();
        System.out.println(ls.find("Linked"));
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
            head.next = head;
        }

        Node secondLast = head;
        Node lastNode = head.next;

        while(lastNode.next != null){
            secondLast = secondLast.next;
            lastNode = lastNode.next;
        }

        secondLast.next = null;
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

    public boolean find(String data){
        Node currNode = head;
        while(currNode != null){
            if(data.equals(currNode.data)){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }
}
