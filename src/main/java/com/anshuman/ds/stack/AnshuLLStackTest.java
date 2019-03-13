package com.anshuman.ds.stack;

public class AnshuLLStackTest {
    public static void main(String[] args) {
        AnshuLLStack stack = new AnshuLLStack();

        stack.push("First");
        stack.push("Second");
        stack.push("Third");
        stack.push("Fourth");
        stack.push("Fifth");

        System.out.println(stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
        System.out.println(stack.peek());


        System.out.println(stack.pop());

        System.out.println(stack.pop());

        System.out.println(stack.isEmpty());


    }

}
