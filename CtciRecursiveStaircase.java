import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-recursive-staircase/problem
    Problem: Given the respective heights for each of the staircases in his house, find and print the number of ways he can climb each staircase on a new line. 
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CtciRecursiveStaircase {
    
    private static Map<Integer, Integer> map = new HashMap<>();
    
    public static int flavors(int n) {
        if(n < 0)
            return 0;
        if(n == 0)
            return 1;
        
        if(!map.containsKey(n)) {
            int count = flavors(n - 1) + flavors(n - 2) + flavors(n - 3);
            map.put(n, count);
        }
        return map.get(n);
    }
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        for(int a0 = 0; a0 < s; a0++){
            int n = in.nextInt();
            System.out.println(flavors(n));
        }
    }
}
