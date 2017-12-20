import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/solve-me-first/problem
    Problem: The purpose of this challenge is to familiarize you with reading input.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class SolveMeFirst {

    static int solveMeFirst(int a, int b) {
         // Hint: Type return a+b; below 
         return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
   }
}
