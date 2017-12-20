import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/countingsort3/problem
    Problem: You will be given a list that contains both integers and strings. In this challenge you just care about the integers. For every value i from 0 to 99, can you output L, the number of elements that are less than or equal to i? 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class Countingsort3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        String[] s = new String[n];
        for(int iA=0; iA<n; iA++) {
            a[iA] = scan.nextInt();
            s[iA] = scan.next();
        }
        
        int[] x = new int[100];
        for(int iX=0; iX<n; iX++) {
            int index = a[iX];
            x[index] += 1;
        }
        print(x);
    }
    
    static void print(int[] x) {
        for(int i=0; i<x.length; i++) {
            int count = 0;
            for(int j=i; j>=0; j--)
                count += x[j];
            System.out.print(count + " ");
        }
    }
}