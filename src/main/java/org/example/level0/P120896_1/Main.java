package org.example.level0.P120896_1;


import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        return Arrays.stream(s.split(""))
                .collect(Collectors.groupingBy(s1 -> s1, Collectors.counting()))
                .entrySet()
                .stream()
                .filter(s1 -> s1.getValue() == 1)
                .map(Map.Entry::getKey)
                .sorted()
                .collect(Collectors.joining());
    }
}

/*
import java.util.Map;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.stream.Collectors;

class Solution {
    public String solution(String s) {
        Map<Character, Integer> map = new HashMap();

        for ( int i = 0; i < s.length(); i++ ) {
            char c = s.charAt(i);

            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder sb = new StringBuilder();

        for ( char c : map.keySet() ) {
            if ( map.get(c) == 1 ) {
                sb.append(c);
            }
        }

        return sb.toString()
            .chars()
            .mapToObj(Character::toString)
            .sorted()
            .collect(Collectors.joining());
    }
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("hello")); // eho
    }
}