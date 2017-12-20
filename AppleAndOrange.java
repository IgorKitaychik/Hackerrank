import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/apple-and-orange/problem
    Problem: Given the value of D for apples and N oranges, can you determine how many apples and oranges will fall on Sam's house (i.e., in the inclusive range [s,t] )? Print the number of apples that fall on Sam's house as your first line of output, then print the number of oranges that fall on Sam's house as your second line of output.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class AppleAndOrange {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int[] apple = new int[m];
        for(int apple_i=0; apple_i < m; apple_i++){
            apple[apple_i] = in.nextInt();
        }
        int[] orange = new int[n];
        for(int orange_i=0; orange_i < n; orange_i++){
            orange[orange_i] = in.nextInt();
        }
        
        int aC = 0;
        for(int i = 0; i<apple.length; i++) {
            if (a + apple[i] >= s && a + apple[i] <=t)
                aC++;
        }
        
        int bC = 0;
        for(int i = 0; i<orange.length; i++) {
            if (b + orange[i] >= s && b + orange[i] <=t) 
                bC++;
        }
        
        System.out.println(aC);
        
        System.out.println(bC);
    }
}
