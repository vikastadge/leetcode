package com.vikastadge.algo;

public class BinarySearch {

    public static void main(String[] args) {
        BinarySearch binarySearch = new BinarySearch();
        System.out.println(binarySearch.search(new int[]{-1,0,3,5,9,12}, 12));
    }

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length-1);
    }

    public int binarySearch(int[] nums, int target, int start, int end){
        int mid = (start + end)/2;
        if(nums[mid]==target){
            return mid;
        }
        if(start >= end){
            return -1;
        }
        if(target < nums[mid]){
            return binarySearch(nums, target, start, mid);
        }else{
            return binarySearch(nums, target, mid+1, end);
        }

    }
}
