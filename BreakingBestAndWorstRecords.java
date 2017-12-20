import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
    Problem: Given Maria's array of scores for a season of n games, find and print the number of times she breaks her record for most and least points scored during the season.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class BreakingBestAndWorstRecords {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] score = new int[n];
        int countLow = 0, countHigh = 0;
        int min = 0, max = 0;
        boolean isFirst = true;
        for(int score_i=0; score_i < n; score_i++){
            score[score_i] = in.nextInt();
            if (isFirst) {
                min = score[score_i];
                max = score[score_i];
                isFirst = false;    
            } else {
                if(min < score[score_i]) {
                    min = score[score_i];
                    countLow++;
                } 
                if(max > score[score_i]) {
                    max = score[score_i];
                    countHigh++;
                }
            }
        }
        System.out.println(countLow + " " + countHigh);
        // your code goes here
    }
}
