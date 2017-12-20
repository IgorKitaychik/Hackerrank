import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/lonely-integer/problem
    Problem: Given A, find and print the unique element.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class LonelyInteger {
     private static int lonelyInteger(int[] a) {
         int v = 0;
         for(int i : a) {
             v = v ^ i;
         }
         return v;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }

}
