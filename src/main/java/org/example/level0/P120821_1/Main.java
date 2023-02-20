package org.example.level0.P120821_1;

public class Main {
    public static void main(String[] args) {
    }
}

class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = new int[num_list.length];

        for ( int i = 0; i < num_list.length; i++ ) {
            int index = num_list.length - i - 1;

            answer[index] = num_list[i];
        }

        return answer;
    }
}