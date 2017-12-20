import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/sherlock-and-the-beast/problem
    Problem: Determine the key to removing the virus by finding the largest Decent Number having N digits.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class SherlockAndTheBeast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int iT = 0; iT < t; iT++) {
            {
                int n = in.nextInt();
                StringBuilder sb = new StringBuilder();
                for (int i = n; i >= 0; i--) {
                    if (i % 3 == 0 && (n - i) % 5 == 0) {
                        for (int j = 0; j < i; j++) 
                            sb.append("5");
                        for (int j = 0; j < n - i; j++) 
                            sb.append("3");
                        break;
                    }
                }
                if (sb.length() == 0) 
                    System.out.println(-1);
                else 
                    System.out.println(sb);
            }
        }
    }
}