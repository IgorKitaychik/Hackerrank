import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-balanced-brackets/problem
    Problem: Given N strings of brackets, determine whether each sequence of brackets is balanced. If a string is balanced, print YES on a new line; otherwise, print NO on a new line.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CtciBalancedBrackets {
    
    public static boolean isBalanced(String expression) {
        Stack<Character> s = new Stack<>();
        for (char c : expression.toCharArray()) {
            if (s.size() == 0) {
                s.push(c);
            } else {
                if (isLeftBracket(c)) {
                    s.push(c);
                } else if (isRightBracket(c)) {
                    if (s.peek() == reverseBracket(c)) {
                        s.pop();
                    }
                }
            }
        }
        
        if (s.size() == 0)
            return true;
        return false;
    }
    
    public static boolean isLeftBracket(char c) {
        boolean isLeft = false;
        if (c == '{' || c == '(' || c == '[') 
            isLeft = true;
        return isLeft;
    }
    
    public static boolean isRightBracket(char c) {
        boolean isRight = false;
        if (c == '}' || c == ')' || c == ']') 
            isRight = true;
        return isRight;
    }

    public static char reverseBracket(char c) {
        char n = ' '; 
        switch (c) {
            case '}':
                n = '{';
                break;
            case ')':
                n = '(';
                break;
            case ']':
                n = '[';
                break;
            default:
                break;
        }
        return n;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println((isBalanced(expression)) ? "YES" : "NO");
        }
    }
}
