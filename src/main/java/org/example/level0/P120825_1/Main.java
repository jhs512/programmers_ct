package org.example.level0.P120825_1;

import java.util.stream.Collectors;

class Solution {
    public String solution(String my_string, int n) {
        return my_string.chars()
                .mapToObj(i -> String.valueOf((char) i).repeat(n))
                .collect(Collectors.joining());
    }
}

public class Main {
}