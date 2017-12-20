import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/diagonal-difference/problem
    Problem: Given a square matrix of size NxN, calculate the absolute difference between the sums of its diagonals.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class DiagonalDifference2 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tD = Integer.parseInt(in.nextLine());
        
        List<String[]> mX = new ArrayList<>();

        for (int i=0; i<tD; i++) {
            mX.add(in.nextLine().split(" "));
        }
        
        int c = 0, m1 = 0, m2 = 0, sum = 0;
        String[] t = null;
        for(String[] s : mX) {
            tD--;
            m1 += Integer.parseInt(s[c]);
            m2 += Integer.parseInt(s[tD]);
            c++;
        }
        sum = (m1 - m2);
        if (sum < 0) sum = sum * -1;
        System.out.print(sum);
    }
}

