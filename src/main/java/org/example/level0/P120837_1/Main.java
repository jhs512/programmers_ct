package org.example.level0.P120837_1;


class Solution {
    public int solution(int hp) {
        int generalAntsCount = 0;
        int soldierAntsCount = 0;
        int workerAntsCount = 0;

        generalAntsCount = hp / 5;
        hp %= 5;

        soldierAntsCount = hp / 3;
        hp %= 3;

        workerAntsCount = hp / 1;

        return generalAntsCount + soldierAntsCount + workerAntsCount;
    }
}

public class Main {
}