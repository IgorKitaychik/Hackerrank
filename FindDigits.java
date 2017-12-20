import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/find-digits/problem
    Problem: For every test case, count and print (on a new line) the number of digits in N that are able to evenly divide N.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class FindDigits {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0; i<T; i++) {
            System.out.println(countDigits(scan.nextInt()));
        }
    }
    
    static int countDigits(int n) {
        String temp = Integer.toString(n);
        char[] c = temp.toCharArray();
        int count = 0;
        for(int j=0; j<c.length; j++) {
            if(Character.getNumericValue(c[j]) != 0 && n % Character.getNumericValue(c[j])== 0)
                count++;
        }
        return count;
    }
}