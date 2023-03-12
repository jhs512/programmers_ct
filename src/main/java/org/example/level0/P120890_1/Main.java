package org.example.level0.P120890_1;


import java.util.Arrays;


class Solution {
    public int solution(int[] array, int n) {
        int diff = Arrays.stream(array)
                .map(e -> n - e)
                .boxed()
                .sorted((o1, o2) -> {
                    if (o1 == o2) return 0;

                    if (Math.abs(o1) == Math.abs(o2)) return o1 < o2 ? 1 : -1;

                    return Math.abs(o1) - Math.abs(o2);
                })
                .mapToInt(e -> e * -1)
                //.peek(System.out::println)
                .limit(1)
                .findFirst()
                .orElse(-1);

        return n + diff;
    }
}




/*
import java.util.Arrays;

class Solution {
    public int solution(int[] array, int n) {
        int diff = Integer.MAX_VALUE;
        int lastNo = Integer.MAX_VALUE;
        int index = -1;

        for ( int i = 0; i < array.length; i++ ) {
            int newDiff = Math.abs(n - array[i]);

            if ( newDiff == 0 ) return array[i];
            else if ( diff > newDiff ) {
                diff = newDiff;
                index = i;
            }
            else if ( diff == newDiff ) {
                diff = newDiff;

                if ( array[index] > array[i] ) {
                    index = i;
                }
            }
        }

        return array[index];
    }
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution(new int[]{10, 11, 12}, 13)); // 12
    }
}