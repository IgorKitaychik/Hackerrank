import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/sherlock-and-squares/problem
    Problem: Count the number of square integers between A and B (both inclusive).
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class SherlockAndSquares {

    public static void main(String[] args) {
   
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int count = (int)(Math.floor(Math.sqrt(b))- Math.ceil(Math.sqrt(a)))+1;
            System.out.println(count);
        }
          
    }
}
