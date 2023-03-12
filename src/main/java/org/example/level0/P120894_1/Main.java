package org.example.level0.P120894_1;


class Solution {
    public long solution(String numbers) {
        return Long.parseLong(
                numbers
                        .replaceAll("zero", "0")
                        .replaceAll("one", "1")
                        .replaceAll("two", "2")
                        .replaceAll("three", "3")
                        .replaceAll("four", "4")
                        .replaceAll("five", "5")
                        .replaceAll("six", "6")
                        .replaceAll("seven", "7")
                        .replaceAll("eight", "8")
                        .replaceAll("nine", "9")
        );
    }
}

/*
class Solution {
    public long solution(String numbers) {
        StringBuilder sb = new StringBuilder();

        int startPos = 0;

        String[] engNumbers = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        int numbersLen = numbers.length();

        while (startPos + 1 < numbersLen) {
            for (int i = 0; i < engNumbers.length; i++) {
                String engNumber = engNumbers[i];
                int endPos = startPos + engNumber.length();

                String bit = numbers.substring(startPos, Math.min(endPos, numbersLen));

                if (bit.equals(engNumber)) {
                    sb.append(i + "");
                    startPos = endPos;
                    break;
                }
            }
        }

        return Long.parseLong(sb.toString());
    }
}
*/

public class Main {
    public static void main(String[] args) {
        System.out.println(new Solution().solution("onetwothreefourfivesixseveneightnine")); // 123456789
    }
}