package org.example.level0.P120864_1;


import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return (int) Arrays
                .stream(my_string.split("[a-z|A-Z]"))
                .filter(s1 -> !s1.isEmpty())
                .mapToInt(Integer::parseInt)
                .sum();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1a2b3c4d123Z")); // 133
    }
}