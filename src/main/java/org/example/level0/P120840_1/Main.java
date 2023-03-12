package org.example.level0.P120840_1;


class Solution {
    public int solution(int balls, int share) {
        share = balls - share > share ? share : balls - share;

        return (int) sol(balls, share);
    }

    public long sol(long balls, long share) {
        if (share == 0) return 1; // 나눠야 할게 없다면 경우의 수는 1개

        return sol(balls - 1, share - 1) * balls / share;
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(5, 3)); // 10
    }
}