package com.vikastadge.algo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
/*
Given an integer numRows, return the first numRows of Pascal's triangle.

In Pascal's triangle, each number is the sum of the two numbers directly above it as shown:
 */
public class PascalsTriangle {
    public static void main(String[] args) {
        PascalsTriangle pascalsTriangle = new PascalsTriangle();
        System.out.println(pascalsTriangle.generate(5));
    }

    public List<List<Integer>> generate(int numRows) {
        final List<List<Integer>> pascalList = new ArrayList<>();
        if(numRows == 0){
            return Collections.emptyList();
        }else if(numRows == 1) {
            pascalList.add(Arrays.asList(1));
        }else if(numRows >= 2) {
            pascalList.add(Arrays.asList(1));
            pascalList.add(Arrays.asList(1,1));

            for(int i = 3;i<=numRows; i++){
                List<Integer> innerList = new ArrayList<>();
                innerList.add(0, 1);
                for( int j = 1; j<i-1;j++){
                    innerList.add(j, pascalList.get(i-2).get(j)+ pascalList.get(i-2).get(j-1));
                }
                innerList.add( 1);
                pascalList.add(innerList);
            }
        }
        return pascalList;
    }
}
