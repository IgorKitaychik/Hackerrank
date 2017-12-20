import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/extra-long-factorials/problem
    Problem: You are given an integer N. Print the factorial of this number. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class ExtraLongFactorials {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(factorial(n));
    }
    
    public static BigInteger factorial(int n) {
        BigInteger b = BigInteger.valueOf((long) 1);
        for(int i = 1; i<=n; i++) {
            b = b.multiply(BigInteger.valueOf(i));
        }
        return b;
    }
}
