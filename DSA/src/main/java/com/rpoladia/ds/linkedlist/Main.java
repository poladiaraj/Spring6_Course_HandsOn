package com.rpoladia.ds.linkedlist;

public class Main {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(3);
        list.add(1);
        list.add(2);
        list.printValues();

        list.addFirst(100);
        list.printValues();

        list.addLast(10);
        list.printValues();

        list.delete(1);
        list.printValues();
//        System.out.println(list.get(3));
//        System.out.println(list);
    }
}
