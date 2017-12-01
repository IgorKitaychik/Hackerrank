import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
	
	/*
		URL: https://www.hackerrank.com/challenges/simple-array-sum/problem
		Description: Given an array of integers, can you find the sum of its elements?
	*/
	
	static int simpleArraySum(int n, int a[]) {
		int sum = 0;
		for(int i=0; i<n; i++) {
			sum+=a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++) {
			a[i] = in.nextInt();
		}
		
		System.out.println(simpleArraySum(n, a));
	}
}