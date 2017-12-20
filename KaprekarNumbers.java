import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/kaprekar-numbers/problem
    Problem: Output each Kaprekar number in the given range, space-separated on a single line. If no Kaprekar numbers exist in the given range, print INVALID RANGE.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class KaprekarNumbers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        boolean isKFound = false;
        for(int i=a; i<=b; i++) {
            if(isKaprekar(i) ) {
                System.out.print(i + " ");    
                isKFound = true;
            }
        }
        if (!isKFound) {
            System.out.print("INVALID RANGE");    
        }
    }
    
    static boolean isKaprekar(long k) {
        if (k == 1) {
            return true;
        }
        else if (k > 8) {
            String c = Long.toString(k*k);
            int a = Integer.parseInt(c.substring(0,(c.length()/2)));
            int b = Integer.parseInt(c.substring((c.length()/2)));
            if(a+b == k) {
               return true;
            }
        }
        return false;
    }
}