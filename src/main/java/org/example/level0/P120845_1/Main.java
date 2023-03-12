package org.example.level0.P120845_1;


import java.util.Arrays;

class Solution {
    public int solution(int[] box, int n) {
        return Arrays.stream(box)
                .map(e -> e / n)
                .reduce(1, (a, b) -> a * b);
    }
}

public class Main {
    public static void main(String[] args) {
        // 10, 8, 6 and 3 => 12
        System.out.println(
                new Solution().solution(new int[]{10, 8, 6}, 3)
        );
    }
}