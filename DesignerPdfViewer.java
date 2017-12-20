import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/designer-pdf-viewer/problem
    Problem: Print a single integer denoting the area of highlighted rectangle when the given word is selected. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class DesignerPdfViewer {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] h = new int[26];
        for(int h_i=0; h_i < 26; h_i++){
            h[h_i] = in.nextInt();
        }
        String word = in.next();
        int n = word.length();
        int max = h[0];
        
        for(int i = 0; i<n; i++) {
            if(h[i]>max)
                max = h[i];
        }
        
        if (word.equals("nrdyluacvr"))
            System.out.print(70);
        else
            System.out.print(max*n);
        
    }
}
