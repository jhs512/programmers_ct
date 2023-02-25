package org.example.level0.P120585_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int[] array, int height) {
        return (int) Arrays.stream(array)
                .filter(h -> h > height)
                .count();
    }
}