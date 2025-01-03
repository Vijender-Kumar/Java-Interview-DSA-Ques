package com.example.interviewPractice.Questions;

import lombok.Getter;

public class LinkedList {
    Node head;
    @Getter
    private int size;

    LinkedList(){
        this.size = 0;
    }
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.printList();
        linkedList.addFirst("name");
        linkedList.addFirst("My");
        linkedList.printList();
        System.out.println();
        linkedList.addLast("is");
        linkedList.addLast("Vijender");
        linkedList.printList();
        System.out.println();
        linkedList.head = linkedList.reverse(linkedList.head);
        linkedList.printList();
        System.out.println();
        System.out.println(linkedList.find("My"));
        linkedList.printList();
        System.out.println();
        Node middle = linkedList.findMiddle(linkedList.head);
        System.out.println(middle.data);
        System.out.println(size(linkedList.head));

    }

    class Node{
        String data;
        Node next;
        Node(String data){
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
            System.out.println("---EMPTY LIST---");
            return;
        }

        Node curr = head;
        while(curr != null){
            System.out.print(curr.data +" -> ");
            curr = curr.next;
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

    public boolean find(String data){
        if(head == null){
            return false;
        }

        Node currNode = head;
        while(currNode != null){
            if(data.equals(currNode.data)){
                return true;
            }
            currNode = currNode.next;
        }
        return false;
    }

    public Node findMiddle(Node head){
        if (head == null) {
            return null;
        }
        int size = 0;
        Node hare = head;
        Node turtle = head;

        while(hare !=null && hare.next!=null){
            hare = hare.next.next;
            turtle = turtle.next;
            size++;
        }
        return turtle;
    }

    public static int size(Node head){
        if(head == null){
            return 0;
        }
        int size = 0;
        Node curr = head;
        while(curr != null){
            curr = curr.next;
            size++;
        }
        return size;
    }
}
