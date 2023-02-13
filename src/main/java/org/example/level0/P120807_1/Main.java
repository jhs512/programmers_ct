package org.example.level0.P120807_1;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(2, 3)); // -1
        System.out.println(new Solution().solution(11, 11)); // 1
        System.out.println(new Solution().solution(7, 99)); // -1
    }
}

class Solution {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}

/*
// v1
class Solution {
    public int solution(int num1, int num2) {
        int answer;

        if (num1 == num2) {
            answer = 1;
        } else {
            answer = -1;
        }

        return answer;
    }
}
*/

/*
// v2
class Solution {
    public int solution(int num1, int num2) {
        int answer = -1;

        if (num1 == num2) {
            answer = 1;
        }

        return answer;
    }
}
*/

/*
// v3
class Solution {
    public int solution(int num1, int num2) {
        int answer = num1 == num2 ? 1 : -1;

        return answer;
    }
}
*/

/*
// v4
class Solution {
    public int solution(int num1, int num2) {
        return num1 == num2 ? 1 : -1;
    }
}
*/