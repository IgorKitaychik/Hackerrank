import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/the-hurdle-race/problem
    Problem: Given n, k, and the heights of all the hurdles, find and print the minimum number of magic beverages Dan must drink to complete the race.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class TheHurdleRace {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] height = new int[n];
        int min = Integer.MIN_VALUE;
        for(int height_i=0; height_i < n; height_i++){
            height[height_i] = in.nextInt();
            if(height[height_i] > min)
                min = height[height_i];
        }
        if (k > min)
            System.out.println("0");
        else
            System.out.println(min-k);
        // your code goes here
    }
}
