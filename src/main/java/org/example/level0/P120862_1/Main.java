package org.example.level0.P120862_1;


import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return Math.max(numbers[0] * numbers[1], numbers[numbers.length - 1] * numbers[numbers.length - 2]);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {10, 20, 30, 5, 5, 20, 5})); // 600
    }
}