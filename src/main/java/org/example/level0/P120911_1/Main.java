package org.example.level0.P120911_1;


import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string.toLowerCase().chars()
                .sorted()
                .mapToObj(e -> (char) e + "")
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("Python")); // "hnopty"
    }
}