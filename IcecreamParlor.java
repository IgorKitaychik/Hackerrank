import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/icecream-parlor/problem
    Problem: Given the value of M and the cost of each flavor for T trips to the Ice Cream Parlor, help Sunny and Johnny choose two flavors such that they spend their entire pool of money (M) during each visit. For each trip to the parlor, print the ID numbers for the two types of ice cream that Sunny and Johnny purchase as two space-separated integers on a new line. You must print the smaller ID first and the larger ID second.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class IcecreamParlor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    	Scanner scan = new Scanner(System.in);
    	int t = scan.nextInt();
    	for(int i=0;i<t;i++) {
    		int m = scan.nextInt();
    		int n = scan.nextInt();
    		int[] a = new int[n];
    		for(int j=0; j<n; j++) {
    			a[j] = scan.nextInt();
    		}
    		flavor(a,m);
    	}
    }

   public static void flavor(int[] a, int m) {
       Map<Integer, Integer> f = new HashMap<Integer, Integer>();
       for(int i=0; i<a.length; i++) {
    		if (!f.containsKey(a[i])) {
    			f.put(m-a[i],i);
    		} else {
    			int v1 = i+1;
    			int v2 = f.get(a[i])+1;
    			System.out.print(v1 > v2 ? v2 + " " + v1 + "\n" : v1 + " " + v1 + "\n");
                break;
    		}
    	}
    }
}