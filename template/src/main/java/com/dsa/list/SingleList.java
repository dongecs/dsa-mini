package com.dsa.list;

/**
 *  单链表
 */
public class SingleList {

    private final Node head = new Node();

    private Node tail = head;

    private int size;


    public boolean append(int data){
        Node node = new Node(data);
        tail.next = node;
        tail = node;
        size++;
        return true;
    }

    public void showList() {
        Node node = head.next;
        while (node != null) {
            System.out.println(node.data);
            node = node.next;
        }
    }

    public class Node {

        private int data;

        private Node next;

        public Node(int data) {
            this.data = data;
        }

        public Node() {

        }
    }
}
