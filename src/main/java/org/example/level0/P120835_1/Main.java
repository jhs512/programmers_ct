package org.example.level0.P120835_1;


import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = Arrays.stream(emergency)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(e -> e)
                .toArray();

        Map<Integer, Integer> map = IntStream.range(0, emergency.length)
                .mapToObj(i -> new int[]{sorted[i], i + 1})
                .collect(Collectors.toMap(e -> e[0], e -> e[1]));

        return IntStream.range(0, emergency.length)
                .map(i -> map.get(emergency[i]))
                .toArray();
    }
}


/*
import java.util.Arrays;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Solution {
    public int[] solution(int[] emergency) {
        Map<Integer, Integer> map = IntStream
                .range(0, emergency.length)
                .mapToObj(i -> Map.entry(emergency[i], i))
                .sorted((o1, o2) -> o2.getKey() - o1.getKey())
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

        int[] arr = new int[emergency.length];

        int i = 1;

        for ( int key : map.keySet() ) {
            int value = map.get(key);
            arr[value] = i++;
        }

        return arr;
    }
}
*/

/*
import java.util.Arrays;
import java.util.Collections;

class Util {
    public static int indexOf(int[] arr, int value) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == value) return i;
        }
        return -1;
    }
}

class Solution {
    public int[] solution(int[] emergency) {
        int[] sorted = Arrays.stream(emergency)
                .boxed()
                .sorted(Collections.reverseOrder())
                .mapToInt(e -> e)
                .toArray();

        return Arrays.stream(emergency)
                .map(e -> Util.indexOf(sorted, e) + 1)
                .toArray();
    }
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(
                Arrays.toString(
                        new Solution().solution(new int[]{30, 10, 23, 6, 100})
                )
        ); // [2, 4, 3, 5, 1]
    }
}