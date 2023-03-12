package org.example.level0.P120902_1;


import java.util.Arrays;

class Solution {
    public int solution(String my_string) {
        return (int) Arrays.stream(
                        my_string
                                .replaceAll(" \\+ ", " ")
                                .replaceAll(" \\- ", " -")
                                .split(" ")
                )
                .mapToInt(Integer::parseInt)
                .sum();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("3 + 4")); // 7
    }
}