package com.vikastadge.algo;

import java.util.Arrays;

/*
Given an array nums, write a function to move all 0's to the end of it while maintaining the relative order of the non-zero elements.

Example:

Input: [0,1,0,3,12]
Output: [1,3,12,0,0]
Note:

You must do this in-place without making a copy of the array.
Minimize the total number of operations.
 */
public class MoveZero {
    public static void moveZeroes(int[] nums) {
        int count =0;
        for (int i = 0;i < nums.length ; i++){
            if (nums[i] != 0){
                nums[count] = nums[i];
                count++;
            }
        }
        while(count < nums.length){
            nums[count] = 0;
            count++;
        }
        Arrays.stream(nums).forEach( i ->System.out.println(i));
    }
    public static void main(String[] args) {
        int[] input = new int[]{0,1,0,3,12};
        moveZeroes(input);
    }
}
