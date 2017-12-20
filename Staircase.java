import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/staircase/problem
    Problem: Write a program that prints a staircase of size N.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = s;
        for(int i=0; i<t; i++) {
            s--;
            for(int j=0; j<t; j++) {
                if(j<s) {
                    System.out.print(" ");        
                } else {
                    System.out.print("#");        
                }
            }
            System.out.println();
        }
    }
}