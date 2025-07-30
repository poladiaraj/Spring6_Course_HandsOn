package com.rpoladia.ds.stack;

public class Main {
    public static void main(String[] args) {
        Stack stack = new Stack(10);

        stack.push(10);
        System.out.println(stack);
        stack.push(30);
        System.out.println(stack);

        System.out.println("Pop: " + stack.pop());
        System.out.println(stack);

        stack.push(70);
        System.out.println(stack);
        stack.push(20);
        System.out.println(stack);
        System.out.println("Peek: " + stack.peek());
        System.out.println(stack);
    }
}
