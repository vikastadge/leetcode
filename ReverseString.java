package com.vikastadge.algo;

/*

Write a function that reverses a string. The input string is given as an array of characters char[].

Do not allocate extra space for another array, you must do this by modifying the input array in-place with O(1) extra memory.

You may assume all the characters consist of printable ascii characters.



Example 1:

Input: ["h","e","l","l","o"]
Output: ["o","l","l","e","h"]
Example 2:

Input: ["H","a","n","n","a","h"]
Output: ["h","a","n","n","a","H"]


 */
public class ReverseString {

    public static void reverseString(char[] s) {

        //for (int i =0, j =s.length-1; i<s.length/2;i++,j--){
        int i=0; int j=s.length-1;
        while(i<j){
            char swap = s[i];
            s[i]=s[j];
            s[j]=swap;
            i++;
            j--;
        }

        System.out.println(s);

    }

    public static void main(String[] args) {
        char[] input = {'h','e','l','l','o'};
        reverseString(input);
    }
}
