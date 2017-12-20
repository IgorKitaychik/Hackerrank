import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/diagonal-difference/problem
    Problem: Given a square matrix of size , calculate the absolute difference between the sums of its diagonals.
	Note: Refer to the above URL for the detailed description of the problem.
*/
	
public class DiagonalDifference {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int l = 0, r = n-1;
        int sumL = 0, sumR = 0;
        for(int a_r=0; a_r<n; a_r++) {
            for(int a_c=0; a_c<n; a_c++) {
                int temp = in.nextInt(); 
                if(l==a_c){
                    sumL+=temp; 
                }
                if(r==a_c){
                    sumR+=temp; 
                }
            }
            l++;
            r--;
        }
        int sum = (sumL - sumR);
        System.out.println(sum < 0 ? sum * -1 : sum);
    }
}