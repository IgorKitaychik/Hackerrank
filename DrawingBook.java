import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/drawing-book/problem
    Problem: Given n and p, find and print the minimum number of pages Brie must turn in order to arrive at page p.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class DrawingBook {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int p = in.nextInt();
        int back = (n-p)/2; 
        int front = p/2; 
        System.out.println(Math.min(back,front));
    }
}
