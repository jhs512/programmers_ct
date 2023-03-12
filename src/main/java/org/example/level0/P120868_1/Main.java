package org.example.level0.P120868_1;


class Solution {
    public int solution(int[] sides) {
        int a = Math.min(sides[0], sides[1]);

        return 2 * a - 1;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{11, 7})); // 13
    }
}