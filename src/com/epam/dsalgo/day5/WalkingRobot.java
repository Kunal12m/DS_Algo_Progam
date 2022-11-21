package com.epam.dsalgo.day5;

import java.util.Arrays;

/**
 * Created by Kunal Mukherjee on 21-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class WalkingRobot {

    public static void main(String[] args) {
        WalkingRobot walkingRobot = new WalkingRobot();
        String path = "ULDR";
        System.out.println(Arrays.toString(walkingRobot.walk(path)));
    }

    public int[] walk(String path) {
        int x = 0, y = 0;
        for (char ch : path.toCharArray()) {
            switch (ch) {
                case 'U':
                    y++;
                    break;
                case 'D':
                    y--;
                    break;
                case 'L':
                    x--;
                    break;
                case 'R':
                    x++;
                    break;
            }
        }
        return new int[]{x, y};
    }
}
