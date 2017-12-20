import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/countingsort2/problem
    Problem: Given an unsorted list of integers, output the integers in order. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class Countingsort2 {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int iA=0; iA<n; iA++) {
            a[iA] = scan.nextInt();
        }
        
        int[] x = new int[n];
        for(int iX=0; iX<n; iX++) {
            int index = a[iX];
            x[index] += 1;
        }
        print(x);
    }
    
    static void print(int[] x) {
        for(int i=0; i<x.length; i++) {
            if(x[i] != 0) {
                for(int j=0; j<x[i]; j++)
                    System.out.print(i + " ");    
            }    
        }
    }
}