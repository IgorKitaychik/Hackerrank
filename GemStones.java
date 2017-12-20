import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/gem-stones/problem
    Problem: Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class GemStones {
    static int[] a = new int[255];
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++) {
            count(scan.next().toCharArray(), i+1);
        }
        print(n);
    }
    
    public static void print(int n) {
        int count = 0;
        for(int i=0; i<a.length; i++) {
            if(a[i] == n)
                count++;
        }
        System.out.println(count);
    }
    
    public static void count(char[] c, int time) {
        int count = 0;
        int[] t = new int[255];
        for(int i=0; i<c.length; i++) {
            t[(int)c[i]] = 1; 
        }
        String temp="";
        for(int i=0; i<c.length; i++) { 
            if(t[(int)c[i]] != 0) {
                if(!temp.contains(Character.toString(c[i]))) {
                    count = a[(int)c[i]] + t[(int)c[i]];
                    a[(int)c[i]] = count;
                }
            }
            temp+=Character.toString(c[i]);
        }
    }
}