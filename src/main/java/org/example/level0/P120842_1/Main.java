
package org.example.level0.P120842_1;


import java.util.Arrays;
import java.util.stream.IntStream;

class Solution {
    public int[][] solution(int[] num_list, int n) {
        return IntStream
                .range(0, num_list.length / n)
                .mapToObj(e -> Arrays.copyOfRange(num_list, e * n, (e + 1) * n))
                .toArray(int[][]::new);
    }
}
/*
class Solution {
    public int[][] solution(int[] num_list, int n) {
        return IntStream
                .range(0, num_list.length / n)
                .mapToObj(e -> Arrays.copyOfRange(num_list, e * n, (e + 1) * n))
                .toArray(int[][]::new);
    }
}

class Solution {
    public int[][] solution(int[] num_list, int n) {
        int[][] answer = new int[num_list.length / n][n];

        for ( int i = 0; i < answer.length; i++ ) {
            for ( int j = 0; j < n; j++ ) {
                answer[i][j] = num_list[n * i + j];
            }
        }

        return answer;
    }
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.deepToString(
                        new Solution().solution(new int[]{100, 95, 2, 4, 5, 6, 18, 33, 948}, 3)
                )
        ); // [[100, 95, 2], [4, 5, 6], [18, 33, 948]]
    }
}