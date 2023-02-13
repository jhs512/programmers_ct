package org.example.level0.P120806_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 2)); // 1200
        System.out.println(new Solution().solution(7, 3)); // 2333
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return (int) ((double) num1 / num2 * 1000);
    }
}
