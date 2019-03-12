package com.anshuman.ds.linkedList;

public class AnshuLinkedList {

    private Node head;

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    public void traverse() {
        Node node = head;
        while(node!=null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

    public void insert(String value) {
        Node newNode = new Node();
        newNode.setValue(value);

        if(null==head) {
            head = newNode;
        } else {
            Node node = head;

            while(node.getNext()!=null) {
                node = node.getNext();
            }

            node.setNext(newNode);
        }
    }

    public void removeByValue(String value) {
        if(null!=head) {
            if(head.getValue().equals(value)) {
                head = head.getNext();
            } else {
                Node prevNode = head;
                Node node = head.getNext();

                while(node!=null) {
                    if(value.equals(node.getValue())) {
                        prevNode.setNext(node.getNext());
                        break;
                    }
                    prevNode = node;
                    node = node.getNext();
                }
            }
        }
    }

    public class Node {
        private String value;

        private Node next;

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }


}
