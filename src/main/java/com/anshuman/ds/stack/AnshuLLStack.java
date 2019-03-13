package com.anshuman.ds.stack;

import com.anshuman.ds.linkedList.AnshuLinkedList;

public class AnshuLLStack {

    AnshuLinkedList linkedList;

    public AnshuLLStack() {
        this.linkedList = new AnshuLinkedList();
    }

    public boolean push(String value) {
        AnshuLinkedList.Node node = linkedList.new Node(value);
        node.setNext(linkedList.getHead());
        linkedList.setHead(node);
        return true;
    }

    public String pop() {
        AnshuLinkedList.Node head = linkedList.getHead();
        if(head!=null) {
            String value = head.getValue();
            linkedList.setHead(head.getNext());
            return value;
        }
        return null;
    }

    public String peek() {
        return linkedList.getHead()!=null ? linkedList.getHead().getValue() : null;
    }

    public boolean isEmpty() {
        return linkedList.getHead()==null;
    }
}
