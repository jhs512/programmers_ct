package org.example.level0.P120804_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 20)); // 200
        System.out.println(new Solution().solution(20, 40)); // 800
        System.out.println(new Solution().solution(60, 50)); // 3000
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 * num2;
    }
}