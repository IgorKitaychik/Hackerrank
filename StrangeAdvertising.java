import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/strange-advertising/problem
    Problem: Given an integer, N, find and print the total number of people who liked HackerLand Enterprise's advertisement during the first N days. It is guaranteed that no two people have any friends in common and, after a person shares the advertisement with a friend, the friend always sees it the next day.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class StrangeAdvertising {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner keyboard = new Scanner(System.in);
        
        int num = keyboard.nextInt();
        int p = 5;
        int s = 0;
        
        for(int i = 0; i < num; i++){
            p = (int) Math.floor(p/2);
            s += p;
            p *= 3;
        }
        
        
        System.out.println(s);
    }
    

}