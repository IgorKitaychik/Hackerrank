import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-lonely-integer/problem
    Problem: Given A, find and print the unique element.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CtciLonelyInteger {
    
    public static int lonelyInteger(int[] a) {
        Arrays.sort(a);
        int sum = 0;
        if (a.length == 1)
            return a[0];
        else {
           for(int i=0;i<a.length;i++) {
               if (i % 2 == 0)
                    sum = sum - a[i];
               else
                   sum = sum + a[i];
           } 
        }
        return (sum * -1);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        System.out.println(lonelyInteger(a));
    }
}
