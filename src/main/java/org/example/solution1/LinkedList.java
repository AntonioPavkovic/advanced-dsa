package org.example.solution1;

public class LinkedList {

    Node head; //head of a linked list

    //node of a linked list
    static class Node {
        int data;
        Node next;
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    /*
    * @param int data
    * method to insert a new node in a front of a list
    * */
    public void push(int data) {

        //Initialize node with the given data
        Node node = new Node(data);

        //Make next of a new Node as head
        node.next = head;

        //Move the head to point to the new node
        head = node;
    }

    /*
    * @param Node previousNode
    * @param int data
    * Method to insert a new after a given previousNode
    * */
    public void insertAfter(Node previousNode, int data) {

        //Check if the given node is null
        if(previousNode == null) {
            System.out.println("Previous node cannot be null");
            return;
        }

        //initialize a new node with given data
        Node node = new Node(data);

        //make next of a new Node as next of a previous Node
        node.next = previousNode.next;

        //make next of a previousNode as new node
        previousNode.next = node;
    }

    /*
    * @param int data
    * adds a new node at the end of a list
    * */
    public void append(int data) {

        //initialize a new node with the given data
        //set next as null
        Node node = new Node(data);

        //if the linked list is empty, then make the new node as head
        if (head == null)
        {
            head = new Node(data);
            return;
        }

        //new node is going to be the last node thus make node.next null
        node.next = null;

        //else traverse till the last node
        Node last = head;
        while (last.next != null) {
            last = last.next;
        }

        //change next of last node
        last.next = node;
    }


    /*
    * @param int data
    * Given a key, deletes a first occurrence of a node in a given linked list
    * */
    public void deleteNode(int data) {

        //store head node
        Node node = head;
        Node previous = null;

        //if head node itself holds the key to be deleted
        if (node != null && node.data == data) {
            head = node.next;
            return ;
        }

        //search for key to be deleted
        //keep track of previous node because node.next needs to be changed
        while (node != null && node.data != data) {
            previous = node;
            node = node.next;
        }

        //if the key is not found in the linked list
        if (node == null) {
            return;
        }

        //unlink the node from the linked list
        previous.next = node.next;
    }

    /*
    * A method for sorting a linked list using Bubble sort algorithm
    * */
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

    /*
    * Method for printing out the lists data
    * */
    public void printList() {

        //Node current will point to the head
        Node current = head;

        if (head == null) {
            System.out.println("List is empty");
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
