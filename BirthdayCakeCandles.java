import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/birthday-cake-candles/problem
    Problem: Given the HEIGHTi for each individual candle, find and print the number of candles that can br successfully blown out. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class BirthdayCakeCandles {

    static int birthdayCakeCandles(int n, int[] ar) {
        // Complete this function
        Arrays.sort(ar);
        int temp = ar[ar.length-1];
        int count = 0;
        for(int i=ar.length;i>0;i--){
            if(temp == ar[i-1]) {
                count++;
            } else {
                break;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int ar_i = 0; ar_i < n; ar_i++){
            ar[ar_i] = in.nextInt();
        }
        int result = birthdayCakeCandles(n, ar);
        System.out.println(result);
    }
}
