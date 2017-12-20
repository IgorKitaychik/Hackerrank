import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/minimum-distances/problem
    Problem: Find the minimum distance between any pair of equal elements in the array. If no such value exists, print -1.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class MinimumDistances {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int A[] = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        //1. create for i and for j
        //2. loop through array to find cases when i == j
        //3. set to min for index difference
        int m = Integer.MAX_VALUE;
        boolean set = false;
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                if(i!=j && A[i]==A[j] && m > Math.abs(i-j)) {
                    m = Math.abs(i-j);
                    set = true;
                }
            }
        }
        System.out.println(set ? m : -1);
    }
}
