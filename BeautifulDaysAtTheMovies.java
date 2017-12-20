import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
    Problem: Given i, j, and k, count and print the number of beautiful days when Logan and Lily can go to the movies.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class BeautifulDaysAtTheMovies {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int c = 0;
        while(i<=j) {
            if(Math.abs((i-reverse(i))/(double)k)%1==0) {
                c++;
            }
            i++;
        }
        System.out.println(c);
    }
    public static int reverse(int i) {
        StringBuilder s = new StringBuilder(Integer.toString(i));
        return Integer.parseInt(s.reverse().toString());
    }
}