package com.epam.dsalgo;

/**
 * Created by Kunal Mukherjee on 15-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}
