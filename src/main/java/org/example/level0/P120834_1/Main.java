package org.example.level0.P120834_1;


import java.util.stream.Collectors;

class Solution {
    public String solution(int age) {
        return (age + "")
                .chars()
                .map(Character::getNumericValue)
                .mapToObj(e -> (char) ('a' + e) + "")
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(100)); // baa
    }
}