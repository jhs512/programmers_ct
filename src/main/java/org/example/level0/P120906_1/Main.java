package org.example.level0.P120906_1;


class Solution {
    public int solution(int n) {
        return String.valueOf(n)
                .chars()
                .map(e -> Character.getNumericValue((char) e))
                .sum();
    }
}

public class Main {
}