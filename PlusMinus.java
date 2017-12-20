import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/plus-minus/problem
    Problem: Given an array of integers, calculate which fraction of its elements are positive, which fraction of its elements are negative, and which fraction of its elements are zeroes, respectively. Print the decimal value of each fraction on a new line.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class PlusMinus {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int t = Integer.parseInt(in.nextLine());
        String[] set = in.nextLine().split(" ");
        
        double posFrac =0,negFrac=0,zeroFrac=0;
        for(int i=0;i<set.length;i++){
            if(Integer.parseInt(set[i])>0)
                posFrac = posFrac + 1;
            else if(Integer.parseInt(set[i])<0)
                negFrac = negFrac + 1;
            else if(Integer.parseInt(set[i])==0)
                zeroFrac = zeroFrac + 1;
        }
        
        System.out.println(posFrac/t);
        System.out.println(negFrac/t);
        System.out.println(zeroFrac/t);
    }
}