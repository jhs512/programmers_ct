package org.example.level0.P120836_1;

import java.util.stream.IntStream;

class Solution {
    public int solution(int n) {
        return (int) IntStream
                .rangeClosed(1, n)
                .filter(i -> n % i == 0)
                .count();
    }
}

public class Main {
}