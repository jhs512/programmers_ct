package org.example.level0.P120852_1;


import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

class Solution {
    public Integer[] solution(int n) {
        Set<Integer> list = new LinkedHashSet<>();

        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                n /= i;
                list.add(i);
            }
        }

        return list.toArray(Integer[]::new);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(new Solution().solution(420))
        ); // [2, 3, 5, 7]
    }
}