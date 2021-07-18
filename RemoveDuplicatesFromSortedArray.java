package com.vikastadge.algo;

public class RemoveDuplicatesFromSortedArray {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};
        int k = removeDuplicates(nums);
        System.out.println("position:-"+k);
    }

    public static int removeDuplicates(int[] nums) {
        int value = -101;
        int position = 0;
        for(int i=0;i<nums.length; i++){
            if(nums[i] != value){
                nums[position] = nums[i];
                value = nums[i];
                position++;
            }
        }
        return position;
    }
}
