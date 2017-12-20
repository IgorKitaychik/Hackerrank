import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/utopian-tree/problem
    Problem: The Utopian Tree goes through 2 cycles of growth every year. Each spring, it doubles in height. Each summer, its height increases by 1 meter. Laura plants a Utopian Tree sapling with a height of 1 meter at the onset of spring. How tall will her tree be after N growth cycles?
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class UtopianTree {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        boolean isSpring = false;
        for(int i=0; i<t; i++) {
            int n = scan.nextInt();
            isSpring = false;
            int c = 1;
            for(int j=0; j<n; j++) {
                if(!isSpring) {
                    c *= 2;
                    isSpring = true;
                } else {
                    c += 1;
                    isSpring = false;
                }    
            }
            System.out.println(c);
        }
    }
}