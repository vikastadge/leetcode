package com.vikastadge.algo;

import java.util.Arrays;

public class SegregateEvenOdd {

    public static void main(String[] args) {
        int[] input = {12, 34, 45, 9, 8, 90, 3};
        input = segregateNumbers(input);
        Arrays.stream(input).forEach(System.out::println);
    }

    private static int[] segregateNumbers(int[] input) {
        int left = 0, right = input.length - 1;
        while (left <= right) {
            if (input[left] % 2 == 0) {
                left++;
                continue;
            }
            if (input[right] %2 == 1){
                right --;
                continue;
            }
            if(left < right){
                int temp = input[right];
                input[right] = input[left];
                input[left] = temp;
            }
        }
        return input;
    }

}
