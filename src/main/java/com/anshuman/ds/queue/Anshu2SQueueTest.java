package com.anshuman.ds.queue;

public class Anshu2SQueueTest {

    public static void main(String[] args) {
        Anshu2SQueue queue = new Anshu2SQueue();

        System.out.println(queue.enqueue("One"));
        System.out.println(queue.enqueue("Two"));
        System.out.println(queue.enqueue("Three"));
        System.out.println(queue.enqueue("Four"));
        System.out.println(queue.enqueue("Five"));

        System.out.println();

        System.out.println(queue.dequeue());

        System.out.println();

        System.out.println(queue.enqueue("Six"));
        System.out.println(queue.enqueue("Seven"));

        System.out.println();

        System.out.println(queue.dequeue());
    }
}
