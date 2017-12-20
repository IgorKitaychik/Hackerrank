import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/camelcase/problem
    Problem: Given s, print the number of words in s on a new line.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class Camelcase {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next(), sActual, sUpper;
        int count = 1;
        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            sActual = Character.toString(c);
            sUpper = Character.toString(c).toUpperCase();
            if (sActual.equals(sUpper)) {
                count++;
            }
        }
        System.out.println(count);
    }
}
