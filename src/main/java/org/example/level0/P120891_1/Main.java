package org.example.level0.P120891_1;


class Solution {
    public int solution(int order) {
        return (int)(order + "")
                .chars()
                .map(Character::getNumericValue)
                .filter(e -> e > 0 && e % 3 == 0)
                .count();
    }
}

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(29423)); // 2
    }
}