package com.anshuman.ds.linkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        AnshuLinkedList linkedList = new AnshuLinkedList();

        linkedList.insertAtEnd("First");
        linkedList.insertAtEnd("Second");
        linkedList.insertAtEnd("Third");
        linkedList.insertAtEnd("Fourth");
        linkedList.insertAtEnd("Fifth");

        linkedList.traverse();

        linkedList.removeByValue("First");
        linkedList.removeByValue("Second");

        linkedList.removeByPosition(0);

        linkedList.insertAtBeginnning("Zero");

        System.out.println();

        linkedList.traverse();

    }
}
