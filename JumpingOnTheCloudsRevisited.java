import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/jumping-on-the-clouds-revisited/problem
    Problem: Given the values of N, K, and the configuration of the clouds, can you determine the final value of E after the game ends?
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class JumpingOnTheCloudsRevisited {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
        }       
        System.out.println(jump(c, k));
    }
    
    public static int jump(int[] c, int k) {
        int t = 100;
        for(int i=0; i<c.length-k+1; i+=k) {
            if(c[i]==1) t-= 3; 
            else t-= 1;   
        }
        return t;
    }
 }
