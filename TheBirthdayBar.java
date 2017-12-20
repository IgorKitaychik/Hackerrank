import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/the-birthday-bar/problem
    Problem: Given m, d, and the sequence of integers written on each square of Lily's chocolate bar, how many different ways can Lily break off a piece of chocolate to give to Ron?
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class TheBirthdayBar {
    static int getWays(int[] squares, int d, int m){
        int sum = 0;
        int count = 0;
        int totalCount = 0;
        for (int i = 0; i <= squares.length - m; i++) {
            for (int j = i; j < i + m; j++) {
                sum += squares[j];
                count++;
                if (sum == d && count == m) {
                    totalCount++;
                }
            }
            sum = 0;
            count = 0;
        }
        return totalCount;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}
