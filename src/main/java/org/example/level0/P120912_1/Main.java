package org.example.level0.P120912_1;


import java.util.Arrays;

class Solution {
    public int solution(int[] array) {
        return (int) Arrays.stream(array)
                .flatMap(e -> (e + "").chars())
                .filter(e -> e == '7')
                .count();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{10, 29})); // 0
    }
}