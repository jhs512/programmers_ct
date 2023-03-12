package org.example.level0.P120853_1;


import java.util.Stack;

class Solution {
    public int solution(String s) {
        Stack<Integer> stack = new Stack<>();

        for (String bit : s.split(" ")) {
            if (bit.equals("Z")) {
                stack.pop();
            } else {
                stack.push(Integer.parseInt(bit));
            }
        }

        int sum = 0;

        for (int n : stack) {
            sum += n;
        }

        return sum;
    }
}

/*
import java.util.Arrays;

class Solution {
    public int solution(String s) {
        return Arrays.stream(s.replaceAll("-?[0-9]* Z", "").trim().split(" "))
            .filter(s1 -> !s1.trim().isEmpty())
            .mapToInt(Integer::parseInt)
            .sum();
    }
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("1 2 Z 3")); // 4
    }
}