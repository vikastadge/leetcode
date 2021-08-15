package com.vikastadge.algo;

import java.util.Arrays;
import java.util.Objects;

public class CountNumberOfOnes {
    public static void main(String[] args) {
        Integer number = 10;
        CountNumberOfOnes countNumberOfOnes = new CountNumberOfOnes();
        System.out.println(countNumberOfOnes.hammingWeight(number));
    }

    public int hammingWeight(int n) {
        return (int) Arrays.stream(Integer.toBinaryString(n).split(""))
                .filter(c -> Objects.equals(c, "1"))
                .count();
    }

}
