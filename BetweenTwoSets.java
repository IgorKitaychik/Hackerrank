import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/between-two-sets/problem
    Problem: Given A and B, find and print the number of integers (i.e., possible 's) that are between the two sets.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class BetweenTwoSets {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] b = new int[m];
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
        }
        Arrays.sort(a);
        int max = a[n-1];
        Arrays.sort(b);
        int min = b[0];
        boolean isA = true;
        boolean isB = true;
        int count = 0;
        for(int i = max; i <= min; i++) {
            for(int a_i = 0; a_i < a.length; a_i++) {
                if(i % a[a_i] != 0) {
                    isA = false;
                    break;
                }    
            }
            
            if(isA) {
                for(int b_i = 0; b_i < m; b_i++){
                    if(b[b_i] % i != 0) {
                        isB = false;
                        break;
                    }
                }
            }
            
            if(isA && isB)
                count++;
            
            isA = true;
            isB = true;
        }
        System.out.println(count);
    }
}
