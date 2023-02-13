package org.example.level0.P120820_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(1)); // 2022
        System.out.println(new Solution().solution(40)); // 1983
        System.out.println(new Solution().solution(23)); // 2000
    }
}

class Solution {
    public int solution(int age) {
        return 2022 - age + 1;
    }
}
