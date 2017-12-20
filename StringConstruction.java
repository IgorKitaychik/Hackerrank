import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/string-construction/problem
    Problem: Given strings (i.e., S0,...,Sn-1), find and print the minimum cost of copying each Si to Pi to a new line.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class StringConstruction {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int a0 = 0; a0 < n; a0++){
            System.out.println(cost(in.next().toCharArray()));
        }
    }
    
    public static int cost(char[] p) {
        Map<String, Integer> s = new HashMap<>();
        for(char e : p) {
            s.put(Character.toString(e),1);
        }
        int count = 0;
        for(Map.Entry<String, Integer> e : s.entrySet()) {
            count++;
        }
        return count;
    }
}
