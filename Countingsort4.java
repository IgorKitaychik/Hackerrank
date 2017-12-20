import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/countingsort4/problem
    Problem: Print the data that accompanies each integer in a list.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Countingsort4 {
       
    public static void main(String[] args) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        StringBuffer[] a = new StringBuffer[100];
        
        for(int i=0;i<100;i++)
        {
            a[i]=new StringBuffer();
        }
        
        for(int i=0; i<n; i++) {
            String[] tmp = in.readLine().split(" ");
            int k = Integer.parseInt(tmp[0]);
            String v = tmp[1] + " ";
        
            if (i < n/2) {
                v = "- ";
            } 
            a[k] = a[k].append(v);
        }
        printData(a);
    }
    
    static void printData(StringBuffer[] a) {
        for(int i=0; i<a.length; i++) {
            System.out.print(a[i]);    
        }
    }
}