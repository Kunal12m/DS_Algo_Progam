package com.epam.dsalgo.day4;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Created by Kunal Mukherjee on 17-11-2022.
 * Kunal_Mukherjee@epam.com
 * EPAM System
 */
public class ApacheLogPattern {

    public static void main(String[] args) {
        String[] lines =
                new String[]{ "10.0.0.1 - frank [10/Dec/2000:12:34:56 -0500] \"GET /a.gif HTTP/1.0\" 200 234",
                        "10.0.0.1 - frank [10/Dec/2000:12:34:57 -0500] \"GET /b.gif HTTP/1.0\" 200 234",
                        "10.0.0.2 - nancy [10/Dec/2000:12:34:58 -0500] \"GET /c.gif HTTP/1.0\" 200 234"};

        System.out.println(new ApacheLogPattern().findTopIPAddress(lines));
    }

    public String findTopIPAddress(String[] lines) {
        String regex = "((?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?\\.){3}(?:(?:25[0-5]|2[0-4][0-9]|[01]?[0-9][0-9]?)))";
        List<String> strings = Arrays.stream(lines).map(e -> e.replaceAll(regex, "")).collect(Collectors.toList());
        int i = 0;
        List<String> strings1 = new ArrayList<>();
        for (String s : lines) {
            strings1.add(s.replace(strings.get(i++), ""));
        }
        Map<String, Long> map = strings1.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Long max = map.entrySet().stream().sorted((e1, e2) -> (int) (e2.getValue() - e1.getValue())).map(Map.Entry::getValue).findFirst().get();
        return map.entrySet().stream().filter(e -> e.getValue().equals(max)).map(Map.Entry::getKey).reduce((a, b) -> a + "," + b).get();
    }
}
