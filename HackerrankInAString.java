import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/hackerrank-in-a-string/problem
    Problem: For each query, print YES on a new line if Si contains hackerrank; otherwise, print NO instead. 
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class HackerrankInAString {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            System.out.println(isHarckerRank(s.toCharArray()) ? "YES" : "NO");
        }
    }
    
    public static boolean isHarckerRank(char[] a) {
        char[] hr = "hackerrank".toCharArray(); int c = 0; String temp = "";
        for(int i=0;i<a.length;i++) {
            if(c < hr.length && a[i] == hr[c]) {
                temp+=Character.toString(a[i]);
                c++;
            }
        }
        if(temp.equals("hackerrank")) return true; return false;
    }
}
