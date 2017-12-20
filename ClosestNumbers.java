import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/closest-numbers/problem
    Problem: Can you find the pair of elements that have the smallest absolute difference between them? If there are multiple pairs, find them all.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class ClosestNumbers {

    static class Pair {
        int x;
        int y;
        int d;
        Pair(int d, int x, int y) {
            this.d = d;
            this.x = x;
            this.y = y;
        }
        
        public int getD() {
            return this.d;
        }
        
        public int getX() {
            return this.x;
        }
        
        public int getY() {
            return this.y;
        }
    }
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        Integer[] a = new Integer[n];
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }
     
        Arrays.sort(a);
        
        List<Pair> p = new ArrayList<>();
        for(int i=0; i<a.length-1; i++) {
            int d = Math.abs(a[i]-a[i+1]);
            p.add(new Pair(d, a[i], a[i+1]));
        }
        
        Comparator<Pair> byPair = (o1, o2) -> o1.getD() - o2.getD();
        Collections.sort(p, byPair);
        
        int t = p.get(0).getD();
        for(Pair e : p) {
            if (t == e.getD()) {
                System.out.print(e.getX() + " " + e.getY() + " ");
                t = e.getD();
            }
        }
    }
}