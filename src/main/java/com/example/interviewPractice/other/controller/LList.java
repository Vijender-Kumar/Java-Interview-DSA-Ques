package com.example.interviewPractice.other.controller;

import lombok.Getter;

public class LList {
    Node head;
    @Getter
    private int size;

    LList(){
        this.size =0;
    }

    public static void main(String[] args) {
        LList ll = new LList();
        ll.printList();
        ll.addLast("Linked");
        ll.addLast("List");
        ll.addFirst("is");
        ll.addFirst("This");
        ll.printList();
        System.out.println("\n Size is:"+ll.getSize());
        ll.removeNth(ll.head, 2);
        ll.printList();
        System.out.println();
        ll.head = ll.reverse(ll.head);
        ll.printList();
        System.out.println("\n Size is:"+ll.getSize());
        ll.deleteFirst();
        ll.printList();
        System.out.println("\n Size is:"+ll.getSize());
        ll.deleteLast();
        ll.printList();
        System.out.println();
        ll.deleteLast();
        ll.printList();

    }

    class Node {
        String data;
        Node next;

        Node(String data) {
            this.data = data;
            this.next = null;
            size++;
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
        size--;
        head = head.next;
    }

    public void deleteLast(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        size--;
        if(head.next == null){
            head = null;
            return;
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
        Node node = head;
        Node prev = null;
        Node next;

        while(node != null){
            next = node.next;
            node.next = prev;

            prev = node;
            node = next;
        }
        return prev;
    }

    public Node removeNth(Node head, int n){
        if(head.next == null){
            return null;
        }
        int size =0;
        Node curr = head;
        while(curr !=null){
            curr = curr.next;
            size++;
        }
//        if(n == size){
//            return head.next;
//        }

        int indexToSearch = size-n;

        Node prev = head;
        int i=1;
        while(i<indexToSearch){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }

}
