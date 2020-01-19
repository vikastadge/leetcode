package com.vikastadge.algo;

import java.util.ArrayList;
import java.util.List;

/*

Write a program that outputs the string representation of numbers from 1 to n.

But for multiples of three it should output “Fizz” instead of the number and for the multiples of five output “Buzz”. For numbers which are multiples of both three and five output “FizzBuzz”.

Example:

n = 15,

Return:
[
    "1",
    "2",
    "Fizz",
    "4",
    "Buzz",
    "Fizz",
    "7",
    "8",
    "Fizz",
    "Buzz",
    "11",
    "Fizz",
    "13",
    "14",
    "FizzBuzz"
]

 */
public class FizzBuzz {

    public static List<String> fizzBuzz(int n) {
        List<String> list = new ArrayList<>();
        for (int j =1;j<=n;j++){
            if ((j % 3 == 0) && (j %5 ==0 )){
                //System.out.println("FizzBuzz");
                list.add("FizzBuzz");
            }else if(j % 3 == 0){
                //System.out.println("Fizz");
                list.add("Fizz");
            }else if(j % 5 ==0){
                //System.out.println("Buzz");
                list.add("Buzz");
            }else{
                //System.out.println(j);
                list.add(String.valueOf(j));
            }

        }
        return list;

    }

    public static void main(String[] args) {
        System.out.println(fizzBuzz(15));
    }
}
