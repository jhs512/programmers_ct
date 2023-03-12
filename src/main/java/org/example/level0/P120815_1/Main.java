package org.example.level0.P120815_1;


class Solution {
    public int solution(int n) {
        return lcm(6, n) / 6;
    }

    public int gcd(int n, int m) {
        if (m == 0) return n;

        return gcd(m, n % m);
    }

    public int lcm(int n, int m) {
        return n * m / gcd(n, m);
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(4)); // 2
    }
}