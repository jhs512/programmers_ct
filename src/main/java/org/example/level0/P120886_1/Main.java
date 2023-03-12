package org.example.level0.P120886_1;


import java.util.Arrays;

class Solution {
    public int solution(String before, String after) {
        return Arrays.compare(
                before
                        .chars()
                        .sorted()
                        .toArray()
                ,
                after
                        .chars()
                        .sorted()
                        .toArray()
        ) == 0 ? 1 : 0;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("allpe", "apple")); // 0
    }
}