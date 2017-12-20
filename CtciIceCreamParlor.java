import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-ice-cream-parlor/problem
    Problem: Print two space-separated integers denoting the respective ID numbers for the two distinct flavors they choose to purchase, where the smaller ID is printed first and the larger ID is printed second. Recall that each ice cream flavor has a unique ID number in the inclusive range from to flavors.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CtciIceCreamParlor {
    
    public static void findMatch(int[] a, int find) {
        List<Integer> l = new ArrayList<Integer>();
        int n1 = 0, n2 = 0, c = 0;

        for (Integer i : a) {
            if (l.contains(i)) {
                n1 = find - i;
                n2 = i;
            } else {
                l.add(find - i);
            }
        }
        
        for (int i = c; i < a.length; i++) {
            if (a[i] == n1) {
                n1 = i + 1;
                c = i + 1; 
                break;
            }
        }
        
        for (int i = c; i < a.length; i++) {
            if (a[i] == n2) {
                n2 = i + 1;
                break;
            }
        }

        System.out.println((n1 < n2) ? n1 + " " + n2 : n2 + " " + n1);
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            int m = in.nextInt();
            int n = in.nextInt();
            int a[] = new int[n];
            for (int a_i = 0; a_i < n; a_i++) {
                a[a_i] = in.nextInt();
            }
            findMatch(a, m);
        }
    }
}
