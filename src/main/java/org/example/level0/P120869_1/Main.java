package org.example.level0.P120869_1;


import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public int solution(String[] spell, String[] dic) {
        String s = Arrays
                .stream(spell)
                .sorted()
                .collect(Collectors.joining());

        return Arrays
                .stream(dic)
                .map(e -> e.chars().sorted().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                        .toString())
                .filter(e -> e.equals(s))
                .count() > 0 ? 1 : 2;
    }
}


public class Main {
    public static void main(String[] args) {
        System.out.println(
                new Solution().solution(
                        new String[]{"s", "o", "m", "d"},
                        new String[]{"moos", "dzx", "smm", "sunmmo", "som"}
                )
        ); // 2
    }
}