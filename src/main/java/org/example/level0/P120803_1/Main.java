package org.example.level0.P120803_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 20)); // -10
        System.out.println(new Solution().solution(20, 40)); // -20
        System.out.println(new Solution().solution(60, 50)); // 10
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 - num2;
    }
}