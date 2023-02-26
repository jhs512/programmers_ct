package org.example.level0.P120889_1;

import java.util.Arrays;

class Solution {
    public int solution(int[] sides) {
        Arrays.sort(sides);

        return sides[0] + sides[1] > sides[2] ? 1 : 2;
    }
}

public class Main {
}