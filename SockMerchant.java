import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/sock-merchant/problem
    Problem: Given N and the color of each sock, how many pairs of socks can John sell?
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class SockMerchant {

    public static void main(String[] args) {
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int c[] = new int[n];
        for(int c_i=0; c_i < n; c_i++){
            c[c_i] = in.nextInt();
            if (m.get(c[c_i]) == null) {
               m.put(c[c_i],1);
            } else {
                m.put(c[c_i],m.get(c[c_i])+1);
            }
        }
        int total = 0;
        for(Map.Entry<Integer,Integer> entry : m.entrySet()) {
            int k = entry.getKey();
            int v = entry.getValue();
            if(v % 2 == 0) {
                total += v/2;
            } else if (v % 2 == 1 && v > 1) {
                v = v - 1;
                total += v/2;
            }
        }
        System.out.println(total);
    }
}
