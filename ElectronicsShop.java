import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/electronics-shop/problem
    Problem: Given the price lists for the store's keyboards and USB drives, find and print the amount of money Monica will spend. If she doesn't have enough money to buy one keyboard and one USB drive, print -1 instead.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class ElectronicsShop {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt(); //keyboards
        int m = in.nextInt(); //drives
        Integer[] keyboards = new Integer[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        Integer[] pendrives = new Integer[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }
        
        Arrays.sort(keyboards);
        Arrays.sort(pendrives, Collections.reverseOrder());
        List<Integer> l = new ArrayList<>();
        for(int i=0; i<n; i++) {
            for(int j=0; j<m; j++) {
                l.add(keyboards[i]+pendrives[j]);
            }
        }
        Collections.sort(l, Collections.reverseOrder());
        int r = -1;
        for(int k=0; k<l.size()-1; k++) {
            if(l.get(k)<=s) {
                r = l.get(k);
                break;
            }
        }  
        System.out.println(r);
    }
}
