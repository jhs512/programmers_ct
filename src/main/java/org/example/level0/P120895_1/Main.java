package org.example.level0.P120895_1;


import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    public String solution(String myString, int num1, int num2) {
        List<String> list = Arrays.stream(myString.split("")).collect(Collectors.toList());

        Collections.swap(list, num1, num2);
        return String.join("", list);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("I love you", 3, 6)); // I l veoyou
    }
}