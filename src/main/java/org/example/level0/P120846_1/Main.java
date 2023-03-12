package org.example.level0.P120846_1;


import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream.rangeClosed(1, n)
                .filter(this::isCompositeNumber)
                .count();
    }

    public boolean isCompositeNumber(int number) {
        for (int i = 2; true; i++) {
            if (i * i > number) return false;

            if (number % i == 0) return true;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(15)); // 8
    }
}