import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/cut-the-sticks/problem
    Problem: Given the length N of sticks, print the number of sticks that are left before each subsequent cut operations.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CutTheSticks {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] s = new int[t];
        for(int i=0; i<t; i++) {
            s[i] = scan.nextInt();
        }
        
        boolean isCut = false;
        while(!isCut) {
            Arrays.sort(s);
            int m = getMinCut(s);
            int sum = 0;
            
            for(int i=0; i<s.length; i++) {
                if(s[i]>0) {
                    sum++;
                    s[i] = s[i]-m;
                }
            }
            
            if(s[s.length-1] <= 0) {
                isCut = true;
            }
            System.out.println(sum);
        }
    }
    
    static int getMinCut(int[] s) {
        for(int i=0; i<s.length; i++) {
            if(s[i] > 0) {
                return s[i];
            }
        }
        return 0;
    }
}
 