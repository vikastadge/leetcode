package com.vikastadge.algo;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.concurrent.*;
import java.util.stream.IntStream;

public class MissingNumber {

    public static int missingNumber(int[] nums) {
        int inputSum = Arrays.stream(nums).sum();
        int actualSum = nums.length * (nums.length + 1) / 2;
        return actualSum - inputSum;
    }

    public static void main(String[] args) {
        int[] nums = {3,0,2};
        System.out.println(missingNumber(nums));
    }
}
