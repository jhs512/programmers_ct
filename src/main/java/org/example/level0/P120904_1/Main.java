package org.example.level0.P120904_1;


class Solution {
    public int solution(int num, int k) {
        return ("-" + num).indexOf(k + "");
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(123456, 7)); // -1
    }
}