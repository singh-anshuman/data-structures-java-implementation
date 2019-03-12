package com.anshuman.ds.linkedList;

public class LinkedListTest {

    public static void main(String[] args) {

        AnshuLinkedList linkedList = new AnshuLinkedList();

        linkedList.insert("First");
        linkedList.insert("Second");
        linkedList.insert("Third");
        linkedList.insert("Fourth");
        linkedList.insert("Fifth");

        linkedList.traverse();

        linkedList.removeByValue("First");

        linkedList.traverse();

    }
}
