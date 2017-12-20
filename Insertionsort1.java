import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/insertionsort1/problem
    Problem: Print the array every time a value is shifted in the array until the array is fully sorted. The goal of this challenge is to follow the correct order of insertion sort. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class Insertionsort1 {
    
    public static void insertIntoSorted(int[] data) {
        // Fill up this function  
        int temp = 0;
        for(int i=1; i<data.length; i++) {
            for(int j=i; j>0; j--) {
                if(data[j] < data[j-1]) {
                    temp = data[j];
                    data[j] = data[j-1];
                    printArray(data);
                    data[j-1] = temp;
                }
            }
        }
        printArray(data);
    }
    
    
/* Tail starts here */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int[] ar = new int[s];
         for(int i=0;i<s;i++){
            ar[i]=in.nextInt(); 
         }
         insertIntoSorted(ar);
    }
    
    
    private static void printArray(int[] ar) {
      for(int n: ar){
         System.out.print(n+" ");
      }
        System.out.println("");
   }
    
    
}
