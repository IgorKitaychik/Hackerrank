import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/beautiful-triplets/problem
    Problem: Given the sequence and the value of D, can you help Erica count the number of beautiful triplets in the sequence?
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class BeautifulTriplets {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++) {
            a[i] = scan.nextInt();
        }
        System.out.println(findTriplet(a, d));
    }
    
    public static int findTriplet(int[] a, int d) {
        int count = 0;
        for(int i = 0; i < a.length; i++) {
            int f = a[i] + d;
            int s = f + d;
            if (IntStream.of(a).anyMatch(x -> x == f) && IntStream.of(a).anyMatch(x -> x == s))
                count++;
        }
        return count;
    }
}