package com.vikastadge.algo;


import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/*
Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

push(x) -- Push element x onto stack.
pop() -- Removes the element on top of the stack.
top() -- Get the top element.
getMin() -- Retrieve the minimum element in the stack.


Example 1:

Input
["MinStack","push","push","push","getMin","pop","top","getMin"]
[[],[-2],[0],[-3],[],[],[],[]]

Output
[null,null,null,null,-3,null,0,-2]

Explanation
MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin(); // return -3
minStack.pop();
minStack.top();    // return 0
minStack.getMin(); // return -2
 */

public class MinStack {
    List<Integer> list;
    int top ;
    List<Integer> minList;
    int minTop;
    public MinStack() {
        list = new ArrayList<>();
        minList = new ArrayList<>();
        top = -1;
        minTop = -1;
    }

    public void push(int x) {
        top++;
        list.add(top, x);
        if(minTop == -1){
            minTop++;
            minList.add(minTop, x);
        }else if(list.get(top) <= minList.get(minTop)){
            minTop++;
            minList.add(minTop, x);
        }
    }

    public void pop() {
        if(top >= 0) {
            if(list.get(top).compareTo(minList.get(minTop)) == 0){
                minList.remove(minTop);
                minTop --;
            }
            list.remove(top);
            top--;
        }
    }

    public int top() {
        return list.get(top);
    }

    public int getMin() {
        return minList.get(minTop);
    }

    public static void main(String[] args) {
        MinStack minStack = new MinStack();
        minStack.push(512);
        minStack.push(-1024);
        minStack.push(-1024);
        minStack.push(512);
        minStack.pop();
        System.out.println("get min "+minStack.getMin()); // return -1024
        minStack.pop();
        System.out.println("get min "+minStack.getMin());//-1024
        minStack.pop();
        System.out.println("get min "+minStack.getMin());//512
    }
}
