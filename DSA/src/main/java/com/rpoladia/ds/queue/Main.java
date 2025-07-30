package com.rpoladia.ds.queue;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.show();

        queue.enqueue(50);
        queue.show();
        queue.enqueue(60);
        queue.show();
        queue.enqueue(70);
        queue.show();
        System.out.println("Dequeue: " + queue.dequeue());
        queue.show();
    }
}
