import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/making-anagrams/problem
    Problem: Given two strings, A and B, that may or may not be of the same length, determine the minimum number of character deletions required to make A and Banagrams. Any characters can be deleted from either of the strings. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class MakingAnagrams {

    /*
    1. Create Array of chars which contains alphabet
    2. Create two HashMaps one keeps count of string a and another of string b
    3. Loop through all keys in either of the arrays to count chars required to be deleted
    */
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        Map<String, Integer> aMap = new HashMap<>();
        Map<String, Integer> bMap = new HashMap<>();
        
        for(int i=0; i<a.length(); i++) {
            if(aMap.get(Character.toString(a.charAt(i))) == null) {
                aMap.put(Character.toString(a.charAt(i)), 1);
            } else {
                int c = aMap.get(Character.toString(a.charAt(i))) + 1;
                aMap.put(Character.toString(a.charAt(i)), c);
            }
        }
                                 
        for(int i=0; i<b.length(); i++) {
            if(bMap.get(Character.toString(b.charAt(i))) == null) {
                bMap.put(Character.toString(b.charAt(i)), 1);
            } else {
                int c = bMap.get(Character.toString(b.charAt(i))) + 1;
                bMap.put(Character.toString(b.charAt(i)), c);
            }
        }
                      
        int sum = 0, aCount = 0, bCount = 0;                         
        for(int i=0; i<alphabet.length; i++) {
            aCount = 0;
            bCount = 0;
            if(aMap.get(Character.toString(alphabet[i])) != null) {
                aCount = aMap.get(Character.toString(alphabet[i]));
            }
            
            if(bMap.get(Character.toString(alphabet[i])) != null) {
                bCount = bMap.get(Character.toString(alphabet[i]));
            }
         
            if(aCount > bCount) {
                sum += aCount-bCount;
            } else if (bCount > aCount) {
                sum += bCount-aCount;
            }
        }
        System.out.println(sum);
        
    }
}