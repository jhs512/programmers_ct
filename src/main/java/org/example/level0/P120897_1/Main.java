package org.example.level0.P120897_1;


import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int n) {
        return IntStream.rangeClosed(1, n)
                .filter(e -> n % e == 0)
                .toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new Solution().solution(29))); // [1, 29]
    }
}