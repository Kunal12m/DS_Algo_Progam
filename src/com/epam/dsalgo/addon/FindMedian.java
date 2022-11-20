package com.epam.dsalgo.addon;

import java.util.Collections;
import java.util.PriorityQueue;

/**
 * Created by Kunal Mukherjee on 20-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class FindMedian {

    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;

    public static void main(String[] args) {
        int[] a = new int[]{1, 5, 6, 2, 3, 9, 4}; // 1,2,3,5,6,9
        FindMedian median = new FindMedian();
        median.minHeap = new PriorityQueue<>(Collections.reverseOrder());
        median.maxHeap = new PriorityQueue<>();
        for (int i : a) {
            median.insert(i);
        }
        System.out.println(median.minHeap + " " + median.maxHeap);
        System.out.println(median.findMedian());
    }

    private double findMedian() {
        if (minHeap.size() == maxHeap.size())
            return (minHeap.peek() + maxHeap.peek()) / (double) 2;
        return minHeap.peek();
    }

    private void insert(int i) {
        if (minHeap.isEmpty() || minHeap.peek() > i) minHeap.add(i);
        else maxHeap.add(i);

        if (minHeap.size() > maxHeap.size() + 1) maxHeap.add(minHeap.poll());
        if (minHeap.size() < maxHeap.size()) minHeap.add(maxHeap.poll());
    }
}
