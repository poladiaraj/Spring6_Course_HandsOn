package com.rpoladia.ds.tree;

public class BinaryTree {
    Node root;
    public void insert(int data) {
        root = insertRec(root, data);
    }

    public Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
        }
        else if (data < root.data) {
            root.left = insertRec(root.left, data);
        } else  {
            root.right = insertRec(root.right, data);
        }

        return root;
    }

    //L-Root-R
    public void inorder() {
        inorderRec(root);
        System.out.println();
    }

    public void inorderRec(Node root) {
        if(root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " ");
            inorderRec(root.right);
        }
    }

    //Root-L-R
    public void preorder() {
        preorderRec(root);
        System.out.println();
    }

    private void preorderRec(Node root) {
        if(root != null) {
            System.out.print(root.data + " ");
            preorderRec(root.left);
            preorderRec(root.right);
        }
    }

    //L-R-Root
    public void postorder() {
        postorderRec(root);
        System.out.println();
    }

    private void postorderRec(Node root) {
        if(root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " ");
        }
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }
}
