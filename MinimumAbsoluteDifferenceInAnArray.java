import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem
    Problem: Given an array of N integers, find and print the minimum absolute difference between any two elements in the array.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class MinimumAbsoluteDifferenceInAnArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        // your code goes here
        Arrays.sort(a);
        int abs2 = Integer.MAX_VALUE;
        for(int i=0;i<n-1;i++) {
            if (abs2 > Math.abs(a[i]-a[i+1]))
                abs2 = Math.abs(a[i]-a[i+1]);
        }
        
        System.out.println(abs2);
    }
}
