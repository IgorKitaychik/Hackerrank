import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/fair-rations/problem
    Problem: Given the number of loaves already held by each citizen, find and print the minimum number of loaves you must distribute to satisfy the two rules above. If this is not possible, print NO.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class FairRations {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        
        int count = 0;
        for(int i=0; i<B.length-1; i++) {
            if(B[i] % 2 != 0) {
                B[i] = B[i] + 1;
                B[i+1] = B[i+1] + 1;
                count+=2;
            }
        }
        
        if((B.length == 2) && ((B[0] % 2 == 2 && B[1] % 2 != 0) || (B[0] % 2 != 2 && B[1] % 2 == 0))) 
            System.out.println("NO");
        else if (B[N-1] % 2 != 0)
            System.out.println("NO");
        else 
            System.out.println(count);
    }
}
