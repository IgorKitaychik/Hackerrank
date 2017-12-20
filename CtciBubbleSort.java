import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-bubble-sort/problem
    Problem: Sort array in ascending order using the Bubble Sort algorithm. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CtciBubbleSort {
    static int count = 0;
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
        bubbleSort(a);
    }
    
    private static void bubbleSort(int[] a) {
        boolean swap = false;
        int temp = 0;
        for(int i=0; i<a.length; i++) {
            swap = false;
            for(int j=0; j<a.length-1;j++) {
                if(a[j] > a[j+1]) {
                    //swap
                    temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    swap = true;
                    count++;
                }
            }
            if(!swap)
                break;
        }
  
        System.out.println("Array is sorted in " + count + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[a.length-1]);                   
    }
}
