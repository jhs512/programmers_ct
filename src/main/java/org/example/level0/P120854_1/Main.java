package org.example.level0.P120854_1;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(String[] strlist) {
        return Arrays.stream(strlist)
                .mapToInt(String::length)
                .toArray();
    }
}