package com.epam.dsalgo.day4;

import java.util.*;

/**
 * Created by Kunal Mukherjee on 18-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class GroupAnagrams {

    public static void main(String[] args) {
        List<String> strings = Arrays.asList("cat", "dog", "god", "eat", "tea", "tan", "ate", "nat", "bat");
        GroupAnagrams groupAnagrams = new GroupAnagrams();
        Set<Set<String>> sets = groupAnagrams.groupAnagrams(strings);
        for (Set<String> s : sets) {
            System.out.println(s);
        }
    }

    public Set<Set<String>> groupAnagrams(List<String> words) {
        HashMap<String, Set<String>> map = new HashMap<>();

        words.forEach(e -> {
            String s = e.chars().mapToObj(ch -> (char) ch).sorted().map(ch -> ch + " ").reduce((a, b) -> a + b).orElse("");
            Set<String> set;
            if (map.containsKey(s)) set = map.get(s);
            else set = new HashSet<>();
            set.add(e);
            map.put(s, set);
        });

        return new HashSet<>(map.values());
    }
}
