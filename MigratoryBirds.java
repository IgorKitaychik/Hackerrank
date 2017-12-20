import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/migratory-birds/problem
    Problem: Given an array of integers where each integer describes the type of a bird in the flock, find and print the type number of the most common bird. If two or more types of birds are equally common, choose the type with the smallest ID number.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class MigratoryBirds {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<Integer,Integer> birds = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++) {
            int birdType = in.nextInt();
            if(birds.get(birdType) == null) {
                birds.put(birdType, 1);    
            } else {
                birds.put(birdType, birds.get(birdType) + 1);
            }
        }
       
        int bird = Integer.MAX_VALUE;
        int birdCount = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> b : birds.entrySet()) {
            if(b.getValue() >= birdCount) {
                bird = b.getKey();
                birdCount = b.getValue();
            }
        }
        
        for(Map.Entry<Integer,Integer> b : birds.entrySet()) {
            if(b.getValue() == birdCount && b.getKey() < bird) {
                bird = b.getKey();
            }
        }
        System.out.println(bird);
    }
}
