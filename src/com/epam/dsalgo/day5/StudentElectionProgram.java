package com.epam.dsalgo.day5;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Kunal Mukherjee on 21-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class StudentElectionProgram {

    public static void main(String[] args) {
        StudentElectionProgram electionProgram = new StudentElectionProgram();
        int n = 100;
        int songLength = 6;
        System.out.println(electionProgram.whoIsElected(n, songLength));
    }

    public int whoIsElected(int numberOfStudents, int songLength) {
        if (songLength == 1) return numberOfStudents;
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= numberOfStudents; i++) list.add(i);
        songLength -= 1;
        int i = 0;
        while (list.size() > 1) {
            i = (i + songLength) % list.size();
            list.remove(i);
        }
        return list.get(0);
    }
}
