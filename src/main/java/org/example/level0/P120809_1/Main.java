package org.example.level0.P120809_1;

import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers) {
        return Arrays.stream(numbers)
                .map(i -> i * 2)
                .toArray();
    }
}

public class Main {
}