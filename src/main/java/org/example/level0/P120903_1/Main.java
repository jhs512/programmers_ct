package org.example.level0.P120903_1;

class Solution {
    public int solution(String[] s1, String[] s2) {
        int answer = 0;

        for (String str : s1) {
            if (contains(s2, str)) {
                answer++;
            }
        }

        return answer;
    }

    public boolean contains(String[] strs, String str) {
        for (String _str : strs) {
            if (_str.equals(str)) {
                return true;
            }
        }

        return false;
    }
}

public class Main {
}