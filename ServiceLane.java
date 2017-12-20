import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/service-lane/problem
    Problem: Given the entry and exit point of Calvin's vehicle in the service lane, output the type of the largest vehicle which can pass through the service lane (including the entry and exit segments).
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class ServiceLane {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        for(int k=0; k<t; k++) {
            int i = scan.nextInt();
            int j = scan.nextInt();
            System.out.println(serviceLane(i, j, a));
        }
    }
    
    static int serviceLane(int i, int j, int[] a) {
        int m = 3;
        for(int s=i; s<=j; s++) {
            if(m>a[s]) {
                m = a[s];
            }
        }
        return m;
    }
}