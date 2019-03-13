package com.anshuman.ds.stack;

public class AnshuStack {

    private int [] data;
    private int cp;

    public AnshuStack(int size) {
        this.data = new int[size];
        cp=0;
    }

    public void push(int value) {
        this.data[cp++] = value;
    }

    public int pop() {
        return this.data[--cp];
    }

    public int peek() {
        return this.data[cp-1];
    }
}
