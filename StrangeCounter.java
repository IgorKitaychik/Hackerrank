import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/strange-code/problem
    Problem: Given a time, T, find and print the value displayed by the counter at time T.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class StrangeCounter {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long t = in.nextLong(), n = 2;
        while (3 * (n - 1) < t) n = 2 * n;
        System.out.println((3 * (n - 1) - t + 1));
    }
}
