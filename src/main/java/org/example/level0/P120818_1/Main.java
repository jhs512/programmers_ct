package org.example.level0.P120818_1;

class Solution {
    public int solution(int price) {
        if (price >= 500_000) price *= 0.8;
        else if (price >= 300_000) price *= 0.9;
        else if (price >= 100_000) price *= 0.95;

        return price;
    }
}

public class Main {
}