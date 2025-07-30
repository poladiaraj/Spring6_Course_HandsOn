package com.rpoladia.ds.queue;

public class Queue {
    private int front = 0;
    private int rear = -1;
    private int size = 0;
    private int[] array = new int[4];

    public Queue() {
    }

    public void enqueue(int data) {
        if(!isFull()) {
            rear = (rear + 1) % array.length;
            array[rear] = data;
            size++;
        }
    }

    public int dequeue() {
        if(!isEmpty()) {
            size--;
            if(size == 0)
                rear = -1;
            int value = array[front];
            front = (front+1) % array.length;
            return value;
        }
        return -1;
    }

    public boolean isFull() {
        return size == array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void show() {
        System.out.print("[ ");
        for(int i = front; i <=rear; i++){
            System.out.print(array[i] + " ");
        }
        System.out.print("]");
        System.out.println();
    }
}
