package com.anshuman.ds.queue;

public class AnshuQueue {

    private int [] data;
    private int front, rear, size;

    public AnshuQueue(int size) {
        this.data = new int[size];
        this.size = size;
        this.front = -1;
        this.rear = -1;
    }

    public boolean enqueue(int value) {
        if((rear + 1)%size == front) {
            //  Queue is full
            return false;
        }

        if(front==-1) {
            //  Queue is empty
            front++;
        }
        rear = (rear + 1)%size;
        data[rear] = value;
        return true;
    }

    public int dequeue() {
        if(front == -1) {
            //  Queue is empty
            return -999;
        }

        if(front==rear) {
            int value = data[front];
            front = -1;
            rear = -1;
            return value;
        }

        int value = data[front];
        front = (front +1)%size;

        return value;
    }

}
