import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/bon-appetit/problem
    Problem: You are given n, k, the cost of each of the n items, and the total amount of money that Brian charged Anna for her portion of the bill. If the bill is fairly split, print Bon Appetit; otherwise, print the amount of money that Brian must refund to Anna.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class BonAppetit {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int bC=0, bA=0, c=0; 
        for(int i=0;i<n;i++) {
            c = scan.nextInt(); 
            if(i != k) 
                bC += c;
        }
        bA = scan.nextInt();
        System.out.println(bC/2 < bA ? bA-bC/2 : "Bon Appetit");
    }
}