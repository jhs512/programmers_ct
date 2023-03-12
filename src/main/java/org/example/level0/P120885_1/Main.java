package org.example.level0.P120885_1;


class Solution {
    public String solution(String bin1, String bin2) {
        return Integer.toBinaryString(
                Integer.parseInt(bin1, 2)
                        +
                        Integer.parseInt(bin2, 2)
        );
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1001", "1111")); // 11000
    }
}