package org.example.level0.P120583_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int solution(int[] array, int n) {
        return (int) Arrays.stream(array)
                .filter(i -> i == n)
                .count();
    }
}