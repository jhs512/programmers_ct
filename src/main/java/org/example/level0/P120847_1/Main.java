package org.example.level0.P120847_1;

import java.util.Arrays;

class Solution {
    public int solution(int[] numbers) {
        Arrays.sort(numbers);

        return numbers[numbers.length - 1] * numbers[numbers.length - 2];
    }
}


public class Main {
}