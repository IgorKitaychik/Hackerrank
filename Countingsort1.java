import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/countingsort1/problem
    Problem: Given a list of integers, can you count and output the number of times each value appears?
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Countingsort1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        int[] c = new int[100];
        int index;
        for(int i =0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        
        for(int j=0;j<n;j++) {
            index = a[j];
            c[index] += 1; 
        }
        
        for(int j=0; j<100;j++) {
            System.out.print(c[j] + " ");
        }
    }
}