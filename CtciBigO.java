import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-big-o/problem
    Problem: For each integer, print whether is Prime or Not prime on a new line.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CtciBigO {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        for (int i = 0; i<p; i++) {
            if(isPrime(scan.nextInt()))
                System.out.println("Prime");
            else
                System.out.println("Not prime");
        }
    }
    
    public static boolean isPrime(int n) {
        if (n == 2) {
            return true;
        }
        if (n % 2 == 0 || n == 1) {
            return false;
        }
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
