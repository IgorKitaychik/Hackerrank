import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/java-2d-array/problem
    Problem: In this problem you have to print the largest sum among all the hourglasses in the array.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Java2darray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        
        int sum = Integer.MIN_VALUE, temp = 0;
        for(int i=0; i < 4; i++){
            for(int j=0; j < 4; j++){
                temp=arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]; 
                if(temp > sum) sum = temp;
            }
        }
        System.out.print(sum);
    }
}
