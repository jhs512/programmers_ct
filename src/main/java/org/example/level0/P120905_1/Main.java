package org.example.level0.P120905_1;

import java.util.Arrays;

class Solution {
    public int[] solution(int n, int[] numlist) {
        return Arrays.stream(numlist)
                .filter(e -> e % n == 0)
                .toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(12, new int[]{2, 100, 120, 600, 12, 12}))); // 120, 600, 12, 12
    }
}