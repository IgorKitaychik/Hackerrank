import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/mars-exploration/problem
    Problem: Given the signal received by Earth as a string, S, determine how many letters of Sami's SOS have been changed by radiation.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class MarsExploration {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int total = S.length();
        char[] c = S.toCharArray();
        char[] c2 = "SOS".toCharArray();
        int r = 0;
        int count = 0;
        for(char e : c) {
            if(e != c2[count])
                r++;
            count++;
            if(count == 3)
                count = 0;
        }
        System.out.println(r);
    }
}
