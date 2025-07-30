package com.rpoladia.ds.linkedlist;

public class LinkedList {
    Node head = null;

    public void add(int data) {
        if(head == null) {
            head = new Node(data);;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = new Node(data);
        }
    }

    public void printValues() {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        add(data);
    }

    public void delete(int data) {
        Node current = head;

        if(current != null) {
             if(current.data == data) {
                 head = current.next;
             }
        }

        while(current.next != null && current.next.data != data) {
            current = current.next;
        }

        if(current.next != null) {
            current.next = current.next.next;
        }
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}
