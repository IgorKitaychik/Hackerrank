import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/funny-string/problem
    Problem: For each String Sj (where 0=<j=<T-1), print whether it is Funny or Not Funny on a new line.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class FunnyString {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] s;
        for(int i = 0; i<n; i++) {
            s = scan.next().toCharArray(); 
            System.out.println(!compare(s, reverse(s)) ? "Not Funny" : "Funny");
        }
    }
    
    public static boolean compare(char[] f, char[] s) {
        for(int i = 0; i<f.length-1; i++) {
            if(Math.abs((int)f[i]-(int)f[i+1]) != Math.abs((int)s[i]-(int)s[i+1])) {
                return false;
            }
        }
        return true;
    }
    
    public static char[] reverse(char[] s) {
        char[] t = new char[s.length];
        int count = s.length-1;
        for(int i = 0; i < s.length; i++) {
            t[i] = s[count];
            count--;
        }
        return t;
    }
}