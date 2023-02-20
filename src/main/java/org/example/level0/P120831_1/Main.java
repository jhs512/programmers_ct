package org.example.level0.P120831_1;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int n) {
        return IntStream.rangeClosed(0, n)
                .filter(i -> i % 2 == 0)
                .sum();
    }
}
