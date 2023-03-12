package org.example.level0.P120888_1;


import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string) {
        return my_string
                .chars()
                .distinct()
                .mapToObj(Character::toString)
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("We are the world")); // We arthwold
    }
}