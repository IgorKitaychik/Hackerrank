import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem
    Problem: Print the minimum number of jumps needed to win the game.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class JumpingOnTheClouds {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }
        System.out.println(jumpCount(c));
    }
    
    //check n+2 if can jump do it else do n+1
    public static int jumpCount(int[] a) {
        int i = 0, j = 0, e = a.length;
        while(i < e) {
            if(i < e-2 && a[i+2] == 0) i+=2;
            else if (i < e-1 && a[i+1] == 0) i+=1;
            else if (i == e-1) break;
            j++;
        }
        return j;
    }
}
