import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/runningtime/problem
    Problem: Can you modify your previous Insertion Sort implementation to keep track of the number of shifts it makes while sorting? The only thing you should print is the number of shifts made by the algorithm to completely sort the array. A shift occurs when an element's position changes in the array. Do not shift an element if it is not necessary.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Runningtime {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        insertionSort(a);
    }
    
    public static void insertionSort(int[] a) {
        int temp, shift=0;
        for(int i=1;i<a.length;i++) {
            for(int j=i;j>0;j--){
                if(a[j] < a[j-1]) {
                    temp = a[j];
                    a[j] = a[j-1];
                    a[j-1] = temp;
                    shift++;
                }
            }
        }
        System.out.println(shift);
    }
    
    public static void printArray(int[] a) {
        for(int i : a) {
            System.out.print(i + " ");
        }
    }
}