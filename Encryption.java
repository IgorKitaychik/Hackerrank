import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/encryption/problem
    Problem: You will be given a message in English with no spaces between the words. The maximum message length can be 81 characters. Print the encoded message.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Encryption {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s = in.next();
        encrypt(s);
    }
  
    public static void encrypt(String s) {
        double sq = Math.sqrt((double)s.length());
        double row = Math.floor(sq);
        double col = Math.ceil(sq);
        
        for(int i = 0; i < col; i++) {
            for(int j = i; j < s.length(); j+=col) {
                System.out.print(Character.toString(s.charAt(j)));
            }
            System.out.print(" ");
        }
    }
    
}
