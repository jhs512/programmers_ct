package org.example.level0.P120843_1;


class Solution {
    public int solution(int[] numbers, int k) {
        return (k - 1) * 2 % numbers.length + 1;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[] {1, 2, 3}, 3)); // 2
    }
}