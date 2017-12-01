import java.io.*;
import java.util.*;

public class Solution {
    
    /*
        URL: https://www.hackerrank.com/challenges/diagonal-difference/problem
        Description: Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
    */
    
    static int diagonalDifference(int[][] a, int n) {
        int sum = 0, sumL = 0, sumR = 0, cR = n - 1;
        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                if (r == c) {
                    sumL += a[r][c];  
                }   
            }
            sumR += a[r][cR];
            cR--;
        }
        sum = (sumL - sumR);  
        return (sum < 0 ? sum * -1 : sum);
    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] a = new int[n][n];
        for(int r=0; r<n; r++) {
            for(int c=0; c<n; c++) {
                a[r][c] = in.nextInt();    
            }
        }
        System.out.println(diagonalDifference(a, n));
    }
}