import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/cavity-map/problem
    Problem: Output lines, denoting the resulting map. Each cavity should be replaced with character X.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class CavityMap {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[][] grid = new int[n][n];
        int row = 0;
        for(int i=0; i<n; i++) {
            char[] d = in.next().toCharArray();
            for(int col=0; col<d.length; col++) {
                grid[row][col] = Character.getNumericValue(d[col]);                
            }
            row++;
        }
           
        for(int i=0; i<grid.length; i++) {
            for(int j=0; j<grid.length; j++) {
                //Check for edge
                if((i != 0 && i != n-1) && (j != 0 && j != n-1)) {
                    //Check if adjacent
                    if((grid[i][j] > grid[i][j-1])
                            && (grid[i][j] > grid[i][j+1]) 
                            && (grid[i][j] > grid[i-1][j]) 
                            && (grid[i][j] > grid[i+1][j])) 
                    {
                        System.out.print("X");
                    } else {
                        System.out.print(grid[i][j]);
                    }
                } else 
                    System.out.print(grid[i][j]);
            }
            System.out.println();
        }
    }
}
