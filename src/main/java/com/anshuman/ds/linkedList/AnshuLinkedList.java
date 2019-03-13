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

    public void insertAtBeginnning(String value) {
        Node node = new Node(value);
        node.setNext(head);
        head = node;
    }

    public void insertAtEnd(String value) {

        if(head==null) {
            head = new Node(value);
        } else {
            Node node = head;

            while(node.getNext()!=null) {
                node = node.getNext();
            }

            node.setNext(new Node(value));
        }
    }

    public void removeByValue(String value) {
        if(null!=head)  {
            if(head.getValue().equals(value)) {
                head = head.getNext();
            } else {
                Node prevNode = head;
                Node node = prevNode.getNext();

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

    public void removeByPosition(int position) {
        if(head!=null) {
            if(position==0) {
                head = head.getNext();
            } else {
                Node prevNode = head;
                Node node = prevNode.getNext();

                int index=1;

                while(index!=position && node!=null) {
                    prevNode = node;
                    node = node.getNext();
                    index++;
                }

                if(node!=null) {
                    prevNode.setNext(node.getNext());
                }
            }
        }
    }

    public class Node {
        private String value;

        private Node next;

        public Node(String value) {
            this.value = value;
        }

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
