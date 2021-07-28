package main.javacore.andrey.task;

import java.util.ArrayDeque;
import java.util.Stack;


public class SecondTask {
    public static void main(String[] args) {
        String text = "()[]{}";
        System.out.println(validateBrackets(text));

    }
    public static boolean validateBrackets(String input) {
        if (input.equals(""))
            return  false;
        Stack<Character> stack = new Stack<Character>();
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (ch == '(' || ch == '{' || ch == '[')
                stack.push(ch);
            else if (ch == ']') {
                if (stack.empty() || stack.pop() != '[')
                    return false;
            } else if (ch == '}') {
                if (stack.empty() || stack.pop() != '{')
                    return false;
            } else if (ch == ')') {
                if (stack.empty() || stack.pop() != '(')
                    return false;
            }
        }
        return true;
    }
}
