package com.epam.dsalgo;

import java.util.Scanner;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class BinaryTree {
    // 5 9 5 -1 -1 8 -1 -1 7 3 -1 -1 1 2 -1 -1 6 -1 -1
    Scanner scanner;
    int diameterOfBT = 0;

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.scanner = new Scanner(System.in);
        Node root = bt.createBinaryTree();
        System.out.println("In Order Traversal Of a Binary Tree");
        bt.inOrder(root);
        System.out.println("\nHeight Of a Binary Tree");
        System.out.println(bt.height(root));
        System.out.println("Longest Path Of a Binary Tree");
        bt.longestPath(root);
        System.out.println(bt.diameterOfBT);
        bt.scanner.close();
    }

    public Node createBinaryTree() {
        Node root = null;
        System.out.println("Enter Your Data");
        int data = scanner.nextInt();
        if (data != -1) {
            root = new Node(data);
            System.out.println("Enter left data for " + data + " Element");
            root.left = createBinaryTree();
            System.out.println("Enter right data for " + data + " Element");
            root.right = createBinaryTree();
        }
        return root;
    }

    public void inOrder(Node root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.print(root.data + " ");
        inOrder(root.right);
    }

    public int height(Node root) {
        if (root == null) return 0;
        return 1 + Math.max(height(root.left), height(root.right));
    }

    public int longestPath(Node root) {
        if (root == null) return 0;
        int left = longestPath(root.left);
        int right = longestPath(root.right);
        diameterOfBT = Math.max(diameterOfBT, 1 + left + right);
        return 1 + Math.max(longestPath(root.left), longestPath(root.right));
    }
}
