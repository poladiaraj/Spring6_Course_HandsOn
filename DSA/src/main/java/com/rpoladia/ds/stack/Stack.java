package com.rpoladia.ds.stack;

public class Stack {
    int[] array;
    int top = -1;
    int size;

    public Stack(int size) {
        array = new int[size];
        this.size = array.length;
    }

    public void push(int data) {
        if(top+1<=size) {
            array[++top] = data;
        } else  {
            System.out.println("Stack Overflow");
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        for(int i = 0; i <= top; i++) {
           sb.append(array[i] + " ");
        }
        sb.append("]");

        return sb.toString();
    }

    public int pop() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return array[top--];
        }
    }

    public int peek() {
        if(top == -1) {
            System.out.println("Stack Underflow");
            return -1;
        } else {
            return array[top];
        }
    }
}
