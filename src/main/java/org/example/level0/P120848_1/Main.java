package org.example.level0.P120848_1;


class Solution {
    public int solution(int n) {
        int v = 1;
        for (int i = 1; true; i++) {
            v *= i;
            if (v > n) {
                return i - 1;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7)); // 3
    }
}