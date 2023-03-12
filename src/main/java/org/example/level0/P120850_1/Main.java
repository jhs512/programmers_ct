package org.example.level0.P120850_1;


import java.util.Arrays;

class Solution {
    public int[] solution(String my_string) {
        return my_string
                .chars()
                .filter(Character::isDigit)
                .map(Character::getNumericValue)
                .sorted()
                .toArray();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Solution().solution("p2o4i8gj2"))
        );
    }
}