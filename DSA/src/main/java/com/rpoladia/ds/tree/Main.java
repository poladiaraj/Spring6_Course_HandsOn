package com.rpoladia.ds.tree;

import com.rpoladia.data.Data;

public class Main {
    public static void main(String[] args) {
        int[] array = Data.UNSORTED_ARRAY_PRIMENUMBERS_UPTO_50;

        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(7);
        tree.insert(12);
        tree.inorder();
        tree.preorder();
        tree.postorder();

        BinaryTree tree2 = new BinaryTree();
        for(int num : array) {
            tree2.insert(num);
        }

        tree2.inorder();
        tree2.preorder();
        tree2.postorder();
    }
}
