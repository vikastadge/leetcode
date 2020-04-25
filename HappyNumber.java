package com.vikastadge.algo;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {

    public static boolean isHappy(int n) {
        while(n > 10){
            int totalSum = 0;
            while(n > 0){
                int digit = n % 10;
                totalSum += digit * digit;
                n /= 10;
            }
            n = totalSum;
        }

        if (n == 1 || n == 7 || n == 10) return true;
        else return false;
    }

    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }
}
