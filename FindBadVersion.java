package com.vikastadge.algo;

public class FindBadVersion {
    public static void main(String[] args) {
        System.out.println(firstBadVersion(5));
    }
    public static int firstBadVersion(int n) {
        int start = 1;
        int end = n;

        while (start<=end){
            int pivot = start + (end-start)/2;
            if(!isBadVersion(pivot)){
                start = pivot + 1;
            }else{
                end = pivot -1;
            }
        }
        return start;
    }

    public static boolean isBadVersion(int n){
        if(n >=3){
            return true;
        }
        return false;
    }
}
