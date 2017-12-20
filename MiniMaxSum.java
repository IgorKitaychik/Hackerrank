import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/mini-max-sum/problem
    Problem: Given five positive integers, find the minimum and maximum values that can be calculated by summing exactly four of the five integers. Then print the respective minimum and maximum values as a single line of two space-separated long integers.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class MiniMaxSum {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] arr = new int[5];
        for(int arr_i=0; arr_i < 5; arr_i++){
            arr[arr_i] = in.nextInt();
        }
        Arrays.sort(arr);
        long sumMin = 0, sumMax = 0;
        for(int a_i=0; a_i<arr.length; a_i++) {
            if(a_i<arr.length-1) {
                sumMin+=arr[a_i];
                sumMax+=arr[a_i+1];
            }
        }
        System.out.print(sumMin + " " + sumMax);
    }
}
