package com.epam.dsalgo.addon;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Created by Kunal Mukherjee on 07-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ValidSquare {

    public static void main(String[] args) {
        int[] p1 = new int[]{0, 0};   //  2   -1
        int[] p2 = new int[]{5, 0};   //  0   -1
        int[] p3 = new int[]{5, 4};   //  1   0
        int[] p4 = new int[]{0, 4};   //  1   -2
        System.out.println(validSquare(p1, p2, p3, p4));
    }

    public static boolean validSquare(int[] p1, int[] p2, int[] p3, int[] p4) {
        List<Integer> list1 = Arrays.asList(p1[0], p2[0], p3[0], p4[0]);
        List<Integer> list2 = Arrays.asList(p1[1], p2[1], p3[1], p4[1]);
        int min1 = list1.stream().mapToInt(e -> e).min().getAsInt();
        int min2 = list2.stream().mapToInt(e -> e).min().getAsInt();
        list1 = list1.stream().map(e -> e - min1).collect(Collectors.toList());
        list2 = list2.stream().map(e -> e - min2).collect(Collectors.toList());
        Set<Integer> set = new HashSet<>();
        for (Integer i : list1) {
            if (set.contains(i)) set.remove(i);
            else set.add(i);
        }
        for (Integer i : list2) {
            if (set.contains(i)) set.remove(i);
            else set.add(i);
        }
        return set.isEmpty();
    }
}
