package com.example.interviewPractice.other.epam;

import lombok.Getter;

public class LinkList {
    Node head;
    @Getter
    private int size;

    LinkList() {
        this.size =0;
    }

    public static void main(String[] args) {
        LinkList ll = new LinkList();
        LinkList ll1;
        ll.addFirst("is");
        ll.addFirst("This");
        ll.addLast("Linked");
        ll.addLast("List");
        ll.printList();
        System.out.println();
        System.out.println();
        ll1 = ll;
        ll1.printList();
        System.out.println();
        ll.head = ll.reverse(ll.head);
        ll1.printList();
//        System.out.println(ll1.equals(ll));
        ll.removeNth(ll.head, 3);
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
        Node curr = head;
        while(curr.next != null){
            curr = curr.next;
        }
        curr.next = newNode;
    }
    public void printList(){
        if(head == null){
            System.out.println("Empty List");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + " -> ");
            curr = curr.next;
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
        Node curr = head;
        Node prev = null;

        while(curr != null){
            Node next = curr.next;
            curr.next = prev;

            prev = curr;
            curr = next;
        }
        return prev;
    }

    public Node removeNth(Node head, int n){
        if(head.next == null){
            return null;
        }

        Node curr = head;
        int size =0;
        while(curr != null){
            curr = curr.next;
            size++;
        }

        int indexToDel = size-n;
        int i=1;
        Node prev = head;
        while(i<indexToDel){
            prev = prev.next;
            i++;
        }
        prev.next = prev.next.next;
        return head;
    }


}

////
//package com.example.interviewPractice.Interview;
//
//public class Ques1 {
//    Node head;
//    public static void main(String[] args){
//        Ques1 ll = new Ques1();
//        ll.printList();
//        ll.addFirst("name");
//        ll.addFirst("My");
//        ll.addLast("is");
//        ll.addLast("Vijender");
//        ll.printList();
//        System.out.println();
//        ll.head = ll.reverse(ll.head);
//        ll.printList();
//        System.out.println();
//        System.out.println(ll.find("iss"));
//        ll.printList();
//        System.out.println();
////        ll.head = ll.middle(ll.head);
////        ll.printList();
////        System.out.println();
//        ll.head = ll.removeNthFromEnd(ll.head, 2);
//        ll.printList();
//    }
//    class Node{
//        String data;
//        Node next;
//        Node(String data){
//            this.data = data;
//            this.next = null;
//        }
//    }
//
//    public void addFirst(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//        newNode.next = head;
//        head = newNode;
//    }
//
//    public void addLast(String data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            return;
//        }
//
//        Node currNode = head;
//        while(currNode.next != null){
//            currNode = currNode.next;
//        }
//        currNode.next = newNode;
//    }
//
//    public void printList(){
//        if(head == null){
//            System.out.println("---List is Empty---");
//            return;
//        }
//
//        Node curr = head;
//        while(curr != null){
//            System.out.print(curr.data + " -> ");
//            curr = curr.next;
//        }
//        System.out.print("NULL");
//    }
//    public Node reverse(Node head){
//        Node curr = head;
//        Node prev = null;
//        Node next;
//
//        while(curr != null){
//            next = curr.next;
//            curr.next = prev;
//
//            prev = curr;
//            curr = next;
//        }
//        return prev;
//    }
//
//    public boolean find(String data){
//        if(head == null){
//            return false;
//        }
//        Node curr = head;
//        while(curr != null){
//            if(data.equals(curr.data)){
//                return true;
//            }
//            curr =  curr.next;
//        }
//        return false;
//    }
//
//    public Node middle(Node head){
//        Node hare = head;
//        Node turtle = head;
//
//        while(hare != null && hare.next != null){
//            hare = hare.next.next;
//            turtle = turtle.next;
//        }
//        return turtle;
//    }
//
//    public Node removeNthFromEnd(Node head, int n){
//        if(head.next == null){
//            return null;
//        }
//        int size =0;
//        Node curr = head;
//        while(curr != null){
//            curr = curr.next;
//            size++;
//        }
//        if(size<n){
//            return null;
//        }
//        if(n == size){
//            return head.next;
//        }
//        Node prev = head;
//
//        int indexToRemove = size-n;
//        int i=1;
//        while(i<indexToRemove){
//            prev = prev.next;
//            i++;
//        }
//        prev.next = prev.next.next;
//        return head;
//    }
//}
