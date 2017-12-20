import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/marcs-cakewalk/problem
    Problem: Given the individual calorie counts for each of the N cupcakes, find and print a long integer denoting the minimum number of miles Marc must walk to maintain his weight. Note that he can eat the cupcakes in any order.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class MarcsCakewalk {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Integer[] calories = new Integer[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories, Collections.reverseOrder());
        long multiplier = 0;
        long miles = 0;
        for(int i=0; i<calories.length; i++) {
            miles = multiplier + (calories[i] * (long)Math.pow(2,i));
            multiplier = miles;
        }
        System.out.println((long)miles);
    }
}
