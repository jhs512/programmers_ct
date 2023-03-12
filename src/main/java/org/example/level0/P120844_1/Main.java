package org.example.level0.P120844_1;


import java.util.Arrays;

class Solution {
    public int[] solution(int[] numbers, String direction) {
        int edgeValue;

        switch (direction) {
            case "right":
                edgeValue = numbers[numbers.length - 1];
                for (int i = numbers.length - 2; i >= 0; i--) {
                    numbers[i + 1] = numbers[i];
                }
                numbers[0] = edgeValue;
                break;
            case "left":
                edgeValue = numbers[0];
                for (int i = 0; i < numbers.length - 1; i++) {
                    numbers[i] = numbers[i + 1];
                }
                numbers[numbers.length - 1] = edgeValue;
                break;
        }

        return numbers;
    }
}

public class Main {
    public static void main(String[] args) {
        // [4, 455, 6, 4, -1, 45, 6], "left" => [455, 6, 4, -1, 45, 6, 4]
        System.out.println(
                Arrays.toString(
                        new Solution().solution(
                                new int[]{4, 455, 6, 4, -1, 45, 6},
                                "left"
                        )
                )
        );
    }
}