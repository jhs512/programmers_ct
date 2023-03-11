package org.example.level0.P120892_1;


import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public String solution(String cipher, int code) {
        return IntStream.rangeClosed(1, cipher.length() / code)
                .mapToObj(i -> cipher.charAt(i * code - 1) + "")
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("pfqallllabwaoclk", 2)); // fallback
    }
}