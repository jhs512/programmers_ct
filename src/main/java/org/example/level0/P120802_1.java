package org.example.level0;

public class P120802_1 {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(10, 20)); // 30
        System.out.println(new Solution().solution(20, 40)); // 60
        System.out.println(new Solution().solution(60, 50)); // 110
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 + num2;
    }
}