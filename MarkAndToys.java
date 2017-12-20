import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/mark-and-toys/problem
    Problem: How can you help Mark buy as many toys as possible.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class MarkAndToys {
    public static void main(String[] args) {
        Scanner stdin=new Scanner(System.in);
        
        int n=stdin.nextInt(),k=stdin.nextInt();
        
        int prices[]=new int[n];
        
        for(int i=0;i<n;i++) prices[i]=stdin.nextInt();
        
        Arrays.sort(prices);
        
        int m = Integer.MIN_VALUE;
        int c = 0, t = 0;
        for(int j=0;j<n;j++) {
            if(prices[j]<k && t<k) {
                t+= prices[j];
                if(t<=k)
                    c++;
            }
        }
        System.out.println(c);
    }
}
