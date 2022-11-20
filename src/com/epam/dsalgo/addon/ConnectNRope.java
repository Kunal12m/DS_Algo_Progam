package com.epam.dsalgo.addon;

import java.util.PriorityQueue;

/**
 * Created by Kunal Mukherjee on 20-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ConnectNRope {

    public static void main(String[] args) {
        int[] input = new int[]{2, 5, 4, 8, 6, 9, 1};
        ConnectNRope connectNRope = new ConnectNRope();
        System.out.println(connectNRope.getMinimalCost(input));
    }

    public int getMinimalCost(int[] ropeLength) {
        if (ropeLength.length <= 1) return 0;
        int cost = 0;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for (int j : ropeLength) {
            pq.add(j);
        }
        while (pq.size() > 1) {
            int a = pq.poll();
            int b = pq.poll();
            cost += (a + b);
            pq.add(a + b);
        }
        return cost;
    }
}
