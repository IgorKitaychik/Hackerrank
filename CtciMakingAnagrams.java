import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-making-anagrams/problem
    Problem: Given two strings, A and B, that may or may not be of the same length, determine the minimum number of character deletions required to make A and B anagrams. Any characters can be deleted from either of the strings. 
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CtciMakingAnagrams {
  
    private static int charCount(String s, char c) {
        int count = 0;
        for(int i=0; i<s.length(); i++) {
            if (s.charAt(i) == c)
                count++;
        }
        return count;
    }
    
    private static String charAppend(int n, char c) {
        String s = "";
        for(int i=0; i<n; i++) {
            s += Character.toString(c);
        }
        return s;
    }
    
    public static int numberNeeded(String first, String second) {
        int firstCount = 0, secondCount = 0, sum = 0;
        int fL = first.length(), sL = second.length();
        char c; 
        //String newFirst = "", newSecond = second;
        for(int i=0; i<first.length(); i++) {
            int tempLength = first.length();
            c = first.charAt(i);
            firstCount = charCount(first, c);
            secondCount = charCount(second, c);
            //sum = firstCount - secondCount;
            if (firstCount > secondCount && secondCount != 0) {
                sum += secondCount;
                //newFirst += charAppend(secondCount, first.charAt(i));
            } else if (firstCount < secondCount && firstCount != 0) {
                sum += firstCount;
            } else if (firstCount == secondCount) {
                sum += firstCount;
            }
            first = first.replace(Character.toString(c),"");
            second = second.replace(Character.toString(c),"");
            if (tempLength > first.length())
                i = i - 1;
        }
        //System.out.println("new length: " + newFirst.length());
        //System.out.println("first length: " + first.length());
        //System.out.println("second length: " + second.length());
        return (fL - sum) + (sL - sum);
    }
  
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
