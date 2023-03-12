package org.example.level0.P120913_1;


import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public String[] solution(String my_str, int n) {
        int myStrLen = my_str.length();

        return IntStream.range(0, (myStrLen + n - 1) / n)
                .mapToObj(i -> my_str.substring(i * n, Math.min((i + 1) * n, myStrLen)))
                .toArray(String[]::new);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                    new Solution().solution("abcdef123", 3)
                )
        ); // ["abc", "def", "123"]
    }
}