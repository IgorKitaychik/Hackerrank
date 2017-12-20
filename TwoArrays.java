import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/two-arrays/problem
    Problem: Consider two n-element arrays of integers, permutate them considering constraints presented.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class TwoArrays {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i=0;i<q;i++) {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int[] f = new int[n];
            int[] s = new int[n];
            for(int j=0;j<n;j++) {
                f[j] = scan.nextInt();
            }
            for(int h=0;h<n;h++) {
                s[h] = scan.nextInt();
            }
            System.out.println(compare(f,s,k) ? "YES" : "NO");
        }
    }
    
    public static boolean compare(int[] f, int[] s, int k) {
        int m=Integer.MAX_VALUE,index=0;
        Set<Integer> u = new HashSet<Integer>();
        for(int i=0;i<f.length;i++) {
            for(int j=0;j<s.length;j++) {
                if(f[i]+s[j]>=k && s[j]<=m && !u.contains(j)) {
                    m = s[j];
                    index = j;
                }
            }
            if (m != Integer.MAX_VALUE) {
                u.add(index);
            }
            m=Integer.MAX_VALUE;
        }
        
        if(u.size()==s.length)
            return true;
        return false;
    }
}