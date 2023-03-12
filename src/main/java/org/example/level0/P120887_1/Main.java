package org.example.level0.P120887_1;


import java.util.stream.IntStream;

class Solution {
    public int solution(int i, int j, int k) {
        return (int) (int) IntStream
                .rangeClosed(i, j)
                .mapToObj(e -> e + "")
                .flatMapToInt(e -> e.chars())
                .filter(e -> e == (k + "").charAt(0))
                .count();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(3, 10, 2)); // 0
    }
}