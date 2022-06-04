package easy;

import java.util.Stack;

public class ValidParentheses {

    /*
     * https://leetcode.com/problems/valid-parentheses/
     * */

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            switch (c){
                case '(': ;
                case '[': ;
                case '{': stack.push(c); break;
                case ')': if(stack.empty() || stack.pop() != '(') return false; else break;
                case '}': if(stack.empty() || stack.pop() != '{') return false; else break;
                case ']': if(stack.empty() || stack.pop() != '[') return false; else break;
            }
        }
        return stack.empty();
    }
}
