package com.vikastadge.algo;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {
    public static void main(String[] args) {
        boolean valid = isValid("[]{}");
        System.out.println(valid);
    }

    public static boolean isValid(String s) {
        final Map<Character, Character> chars = new HashMap<>(3);
        chars.put(')', '(');
        chars.put('}', '{');
        chars.put(']','[');
        final Stack<Character> stack = new Stack<>();
        for(Character c : s.toCharArray()){
            stack.push(c);
            if(chars.containsKey(stack.peek())){
                final Character pop = stack.pop();
                if(stack.empty() || stack.pop() != chars.get(pop)){
                    return false;
                }
            }
        }
        return stack.empty();
    }
}
