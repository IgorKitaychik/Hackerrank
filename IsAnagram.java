import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/java-anagrams/problem
    Problem: Determine if two strings are anagrams.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class IsAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("John","nhOJ"));
        System.out.println(isAnagram("John2","nhOJ"));
    }
	
    static boolean isAnagram(String a, String b) {
        char[] aChar = a.toLowerCase().toCharArray();
        char[] bChar = b.toLowerCase().toCharArray();
        Arrays.sort(aChar);
        Arrays.sort(bChar);
        String aString = new String(aChar);
        String bString = new String(bChar);
        return aString.equals(bString);
    }
}
