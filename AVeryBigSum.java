import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/a-very-big-sum/problem
    Problem: Print a single value equal to the sum of the elements in the array.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class AVeryBigSum {

    static long aVeryBigSum(int n, int[] ar) {
        // Complete this function
        long result = 0;
        for(int ar_i = 0; ar_i < n; ar_i++){
            result += ar[ar_i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        long result = aVeryBigSum(n, ar);
        System.out.println(result);
    }
}
