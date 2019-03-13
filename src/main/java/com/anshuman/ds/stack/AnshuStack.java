package com.anshuman.ds.stack;

public class AnshuStack {

    private int [] data;
    private int top;
    private int size;

    public AnshuStack(int size) {
        this.data = new int[size];
        this.size = size;
        top=-1;
    }

    public boolean push(int value) {
        if(top<size) {
            this.data[++top] = value;
            return true;
        }
        return false;

    }

    public int pop() {
        if(top>=0) {
            return this.data[top--];
        }
        return -1;
    }

    public int peek() {
        if(top>=0) {
            return this.data[top];
        }
        return -1;
    }

    public boolean isEmpty() {
        return top==-1;
    }
}
