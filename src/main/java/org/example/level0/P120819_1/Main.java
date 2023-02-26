package org.example.level0.P120819_1;

class Solution {
    public int[] solution(int money) {
        final int price = 5500;
        int count = money / price;

        return new int[]{count, money - count * price};
    }
}

public class Main {
}