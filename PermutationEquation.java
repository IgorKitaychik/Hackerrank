import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/permutation-equation/problem
    Problem: For each X where 1=<X=<N, find any integer Y such that p(p(y)))=x and print the value of Y on a new line.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class PermutationEquation {
    public static void main(String args[] ) throws Exception {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer,Integer> s = new LinkedHashMap<Integer, Integer>();
        for(int i=1; i<=n; i++) {
            s.put(scan.nextInt(),i);
        }
        findY(s,n);
    }
    
    static void findY(Map<Integer,Integer> s , int n) {
        for(int i=1; i<=n; i++) {
            System.out.println(s.get(s.get(i)));          
        }
    }
}
