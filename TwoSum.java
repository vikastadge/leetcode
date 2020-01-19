package com.vikastadge.algo;

import java.util.Arrays;
import java.util.HashMap;
/*

Given an array of integers, return indices of the two numbers such that they add up to a specific target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

Example:

Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

 */
public class TwoSum {

    public int[] twoSum(int[] nums, int target) {
        int[] location = new int[2];
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i=0;i<nums.length;i++) {
            int remain = target - nums[i];
            if (map.containsKey(nums[i])){
                location[0]= map.get(nums[i]);
                location[1]= i;
            }else {
                map.put(remain, i);
            }
        }
        return location;
    }

    public static void main(String[] args) {
        int[] nums = {2,7,11,15};
        int target = 8;
        TwoSum a = new TwoSum();
        //System.out.println(a.twoSum(nums, target));
        Arrays.stream(a.twoSum(nums, target)).forEach(i->
                System.out.println(i));
    }
}
