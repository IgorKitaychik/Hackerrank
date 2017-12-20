import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/maximizing-xor/problem
    Problem: Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition: L=<A=<B=<R.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class MaximizingXor {

    static int maxXor(int l, int r) {
        int v = 0;
        int max = Integer.MIN_VALUE;
        for(int i=l; i<=r; i++) {
            for(int j=i; j<=r; j++) {
                v = i^j;
                if(max < v) {
                    max = v;
                }
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}
