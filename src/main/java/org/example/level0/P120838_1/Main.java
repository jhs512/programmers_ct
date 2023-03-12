package org.example.level0.P120838_1;


import java.util.Arrays;
import java.util.stream.Collectors;

class Solution {
    public String solution(String letter) {
        return Arrays.stream(letter.split(" "))
                .map(e -> switch (e) {
                    case ".-" -> "a";
                    case "-..." -> "b";
                    case "-.-." -> "c";
                    case "-.." -> "d";
                    case "." -> "e";
                    case "..-." -> "f";
                    case "--." -> "g";
                    case "...." -> "h";
                    case ".." -> "i";
                    case ".---" -> "j";
                    case "-.-" -> "k";
                    case ".-.." -> "l";
                    case "--" -> "m";
                    case "-." -> "n";
                    case "---" -> "o";
                    case ".--." -> "p";
                    case "--.-" -> "q";
                    case ".-." -> "r";
                    case "..." -> "s";
                    case "-" -> "t";
                    case "..-" -> "u";
                    case "...-" -> "v";
                    case ".--" -> "w";
                    case "-..-" -> "x";
                    case "-.--" -> "y";
                    default -> "z";
                })
                .collect(Collectors.joining());
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(".--. -.-- - .... --- -.")); // "python"
    }
}