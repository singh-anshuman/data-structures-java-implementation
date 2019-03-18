package com.anshuman.ds.queue;

public class AnshuQueueTest {

    public static void main(String[] args) {
        AnshuQueue queue = new AnshuQueue(4);

        System.out.println(queue.enqueue(11));
        System.out.println(queue.enqueue(13));
        System.out.println(queue.enqueue(15));
        System.out.println(queue.enqueue(17));

        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());

        System.out.println(queue.enqueue(19));

        System.out.println(queue.dequeue());
    }

}
