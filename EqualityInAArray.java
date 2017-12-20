import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/equality-in-a-array/problem
    Problem: Print a single integer denoting the minimum number of elements Karl must delete for all elements in the array to be equal.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class EqualityInAArray {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer,Integer> m = new HashMap<Integer,Integer>();
        for(int i=0;i<n;i++) {
            int e = scan.nextInt();
            if(m.get(e)==null) {
                m.put(e,1);
            } else {
                m.put(e,m.get(e)+1);
            }
        }
        int max = Integer.MIN_VALUE;
        for(Map.Entry<Integer,Integer> e : m.entrySet()) {
            if(e.getValue() > max) max = e.getValue();
        }
        System.out.println(n-max);
    }
}