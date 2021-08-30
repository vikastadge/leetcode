package com.vikastadge.algo;
/*
350. Intersection of Two Arrays II
Given two integer arrays nums1 and nums2, return an array of their intersection.
Each element in the result must appear as many times as it shows in both arrays and you may return the result in any order.
 Example 1:

Input: nums1 = [1,2,2,1], nums2 = [2,2]
Output: [2]
Example 2:

Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
Output: [9,4]
Explanation: [4,9] is also accepted.

 */

import java.util.ArrayList;
import java.util.List;

public class InterSectionOfTwoArrays {
    public static void main(String[] args) {
        InterSectionOfTwoArrays interSectionOfTwoArrays = new InterSectionOfTwoArrays();
        int[] intersect = interSectionOfTwoArrays.intersect(new int[]{1,2,2,1}, new int[]{2,2});
        for(int i =0;i< intersect.length;i++){
            System.out.println(intersect[i]);
        }

    }
    public int[] intersect(int[] nums1, int[] nums2) {
        final int[] exists = new int[1001];
        for(int i =0 ;i< nums1.length; i++){
            int number = nums1[i];
            if(exists[number] == 0){
                exists[number] = 1;
            }
        }

        for(int i =0 ;i< nums2.length; i++){
            int number = nums2[i];
            if(exists[number] == 1){
                exists[number] = 2;
            }
        }
        final List<Integer> list = new ArrayList<>();
        for(int i =0 ;i< exists.length; i++){
            if(exists[i] == 2){
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> (int) i).toArray();
    }
}
