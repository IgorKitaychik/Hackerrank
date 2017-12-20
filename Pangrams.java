import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/pangrams/problem
    Problem: Determine if it is a pangram or not.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Pangrams {
    List<String> alphabet = new ArrayList<>();
    
    Solution() {
        for (int i = 97; i<=122; i++) {
            alphabet.add(Character.toString((char)i));
        }
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String w = scan.nextLine();
        Solution p = new Solution();
        System.out.println(p.isPangram(w) ? "pangram" : "not pangram");
    }
    
    public boolean isPangram(String w) {
        for (String e : alphabet) {
            if (!w.toLowerCase().contains(e.toLowerCase())) 
                return false;
        }
        return true;
    }
}