import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem
    Problem: Print a single line of N space-separated integers denoting the final state of the array after performing D left rotations.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CtciArrayLeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        
        rotate(k,a);
    }
    
    private static void rotate(int r, int[] data) {
        int[] dataTemp = new int[data.length];
        int mod = r % (data.length);
        for (int i = 0; i < data.length; i++) {
            if (i< (data.length-mod)) {
                System.out.print(data[i + mod] + " ");
            } else {
                System.out.print(data[i - data.length+mod] + " ");
            }
        }
    }
    
}
