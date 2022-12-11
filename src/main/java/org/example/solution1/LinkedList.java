package org.example.solution1;

public class LinkedList {

    Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void push(int data) {

        Node node = new Node(data);

        node.next = head;

        head = node;
    }


    public void insertAfter(Node previousNode, int data) {

        if(previousNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        Node node = new Node(data);
        node.next = previousNode.next;
        previousNode.next = node;
    }

    public void append(int data) {

        Node node = new Node(data);

        if (head == null)
        {
            head = new Node(data);
            return;
        }

        node.next = null;

        Node last = head;
        while (last.next != null)
            last = last.next;

        last.next = node;
    }

    public void deleteNode(int data) {

        Node node = head;
        Node previous = null;

        if (node != null && node.data == data) {
            head = node.next;
            return ;
        }

        while (node != null && node.data != data) {
            previous = node;
            node = node.next;
        }

        if (node == null) {
            return;
        }

        previous.next = node.next;
    }

    public void sortList() {

        Node current = head;
        Node index = null;
        int temp;

        if (head == null) {
            return;
        }
        else {
            while (current != null) {

                index = current.next;

                while (index != null) {

                    if(current.data > index.data) {
                        temp = current.data;
                        current.data = index.data;
                        index.data = temp;
                    }
                    index = index.next;
                }
                current = current.next;
            }
        }
    }

    public void printList() {

        Node current = head;

        if (head == null) {
            System.out.println("Lista je prazna");
            return;
        }

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    public static void main(String[] args) {

        LinkedList list = new LinkedList();

        list.append(16);
        list.append(31);
        list.append(5);

        list.push(14);
        list.push(27);

        list.insertAfter(list.head.next, 7);
        list.insertAfter(list.head, 11);

        list.printList();

        System.out.println("----------------------------------------------");

        list.deleteNode(31);
        list.printList();

        System.out.println("----------------------------------------------");

        list.sortList();
        list.printList();
    }

}
