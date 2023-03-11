package org.example.level0.P120839_1;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Collectors;

class Solution {
    public String solution(String rsp) {
        return IntStream.range(0, rsp.length())
                .mapToObj(i -> {
                    char c = rsp.charAt(i);

                    if ( c == '2' ) return "0";
                    else if ( c == '0' ) return "5";
                    else return "2";
                })
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("205")); // 052
    }
}