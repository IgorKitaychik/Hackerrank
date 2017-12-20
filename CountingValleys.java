import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/counting-valleys/problem
    Problem: Given Gary's sequence of up and down steps during his last hike, find and print the number of valleys he walked through.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CountingValleys {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        char[] s = scan.nextLine().toCharArray();
        int l = 0, v = 0;
        boolean isValley = false;
        for(int i=0; i<n; i++) {
            if(s[i]=='U') {
                l++;
            } else {
                l--;
            }
            if(l<0) {
                isValley = true;
            }
            if(l==0 && isValley){
                v++;
                isValley = false;
            }            
        }
        System.out.println(v);
    }
}