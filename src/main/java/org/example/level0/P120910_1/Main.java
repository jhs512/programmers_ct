package org.example.level0.P120910_1;


class Solution {
    public int solution(int n, int t) {
        return n * (int) Math.pow(2, t);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(7, 15));
    }
}