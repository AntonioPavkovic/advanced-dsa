package org.example.problem3;
public class solution3 {

    Node root;

    public solution3() {
        root = null;
    }

    public void addChild(Node parent, Node child) {
        if (parent.firstChild == null) {
            parent.firstChild = child;
        } else {
            Node temp = parent.firstChild;

            while (temp.nextSibling != null) {
                temp = temp.nextSibling;
            }

            temp.nextSibling = child;
        }
    }

    public void print(Node node) {
        if (node != null) {
            System.out.println(node.data + " ");
            print(node.firstChild);
            print(node.nextSibling);
        }
    }

    public static void main(String[] args) {

        solution3 binaryTree = new solution3();

        binaryTree.root = new Node(1);

        binaryTree.addChild(binaryTree.root, new Node(17));
        binaryTree.addChild(binaryTree.root, new Node(36));
        binaryTree.addChild(binaryTree.root, new Node(4));
        binaryTree.addChild(binaryTree.root, new Node(71));
        binaryTree.addChild(binaryTree.root, new Node(6));
        binaryTree.addChild(binaryTree.root, new Node(24));
        binaryTree.addChild(binaryTree.root, new Node(55));

        binaryTree.print(binaryTree.root);
    }

}