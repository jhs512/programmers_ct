package org.example.level0.P120893_1;

import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string
                .chars()
                .map(e -> Character.isUpperCase(e) ? Character.toLowerCase(e) : Character.toUpperCase(e))
                .mapToObj(e -> (char) e + "")
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("abCdEfghIJ")); // ABcDeFGHij
    }
}