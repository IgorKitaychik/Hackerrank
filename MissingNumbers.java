import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/missing-numbers/problem
    Problem: Can you find the missing numbers?
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class MissingNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Map<Integer,Integer> a = new HashMap<Integer,Integer>();
        Map<Integer,Integer> b = new HashMap<Integer,Integer>();
        for(int i=0; i<n; i++){
            int e = scan.nextInt();
            if(!a.containsKey(e)) {
                a.put(e,1);
            } else {
                a.put(e,a.get(e)+1);
            }
        }
        int m = scan.nextInt();
        for(int j=0; j<m; j++){
            int e2 = scan.nextInt();
            if(!b.containsKey(e2)) {
                b.put(e2,1);
            } else {
                b.put(e2,b.get(e2)+1);
            }
        }
        
        for(Map.Entry<Integer,Integer> e : b.entrySet()) {
            int k = e.getKey();
            int v = e.getValue();
            int v2 = a.get(k);
            a.put(k,v2-v);  
        }
        List<Integer> l = new ArrayList<Integer>();
        for(Map.Entry<Integer,Integer> e : a.entrySet()) {
            if(e.getValue()!=0) {
                l.add(e.getKey());
            }
        }
        Collections.sort(l);
        for(Integer i : l) {
            System.out.print(i + " ");
        }
    }
}