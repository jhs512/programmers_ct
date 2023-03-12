package org.example.level0.P120899_1;


import java.util.Arrays;

class Solution {
    public int[] solution(int[] array) {
        int maxValue = -1;
        int maxIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] > maxValue) {
                maxValue = array[i];
                maxIndex = i;
            }
        }

        return new int[]{maxValue, maxIndex};
    }
}

public class Main {
    public static void main(String[] args) {

        System.out.println(Arrays.toString(new Solution().solution(new int[]{9, 10, 11, 8}))); // [11, 2]
    }
}