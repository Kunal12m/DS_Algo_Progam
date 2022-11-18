package com.epam.dsalgo.day4;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String s = "apple";
        FirstNonRepeatingCharacter repeatingCharacter = new FirstNonRepeatingCharacter();
        System.out.println(repeatingCharacter.findFirstNonRepeatingCharacter(s));
    }

    public char findFirstNonRepeatingCharacter(String input) {
        if (input == null) throw new RuntimeException("No String Found");
        if (input.length() == 0) return ' ';
        return input.chars().mapToObj(e -> (char) e)
                .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()))
                .entrySet().stream().filter(e -> e.getValue() == 1L)
                .map(Map.Entry::getKey).findFirst().get();
    }
}
