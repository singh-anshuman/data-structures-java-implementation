package com.anshuman.ds.queue;

import com.anshuman.ds.stack.AnshuLLStack;

public class Anshu2SQueue {

    private AnshuLLStack stack1, stack2;

    public Anshu2SQueue() {
        stack1 = new AnshuLLStack();
        stack2 = new AnshuLLStack();
    }

    public boolean enqueue(String value) {
        return stack1.push(value);
    }

    public String dequeue() {
        if(!stack2.isEmpty()) {
            return stack2.pop();
        }

        while(!stack1.isEmpty()) {
            stack2.push(stack1.pop());
        }
        return stack2.pop();
    }

}
