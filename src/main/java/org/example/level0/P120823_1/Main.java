package org.example.level0.P120823_1;


import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(
                IntStream.rangeClosed(1, n)
                        .mapToObj(e -> "*".repeat(e))
                        .collect(Collectors.joining("\n"))
        );
    }
}

public class Main {
}