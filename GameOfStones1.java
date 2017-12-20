import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/game-of-stones-1/problem
    Problem: Given the number of stones, find and print the name of the winner (i.e., First or Second) on a new line. Each player plays optimally, meaning they will not make a move that causes them to lose the game if some better, winning move exists.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class GameOfStones1 {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i=0; i<t; i++) {
            System.out.println(scan.nextInt()%7<2?"Second":"First");
        }
    }
}