import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/stockmax/problem
    Problem: Your algorithms have become so good at predicting the market that you now know what the share price of Wooden Orange Toothpicks Inc. (WOT) will be for the next N days. Each day, you can either buy one share of WOT, sell any number of shares of WOT that you own, or not make any transaction at all. What is the maximum profit you can obtain with an optimum trading strategy?
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Stockmax {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int N = in.nextInt();
            int[] prices = new int[N];
            for(int prices_i=0; prices_i < N; prices_i++){
                prices[prices_i] = in.nextInt();
            }
            System.out.println(calculateMaxProfit(prices));
        }
    }
        
    public static long calculateMaxProfit(int[] prices) {
        Stack<Integer> s = new Stack<Integer>();
        int m = 0;
        long totalSpent = 0, totalProfit = 0, shareCount = 0;
        for (int i = prices.length - 1; i > 0; i--) {
            if (prices[i] >= m) {
                m = prices[i];
                s.push(m);
            }
        }
        if (s.empty() || s.size() == prices.length - 1) {
            return 0;
        }
        int sell = s.pop();
        for (int j = 0; j < prices.length; j++) {
            if (prices[j] != sell) {
                totalSpent += prices[j];
                shareCount++;
            } else {
                totalProfit += (shareCount * sell) - totalSpent;
                totalSpent = 0;
                shareCount = 0;
                if (!s.empty()) {
                    sell = s.pop();
                } else {
                    break;
                }
            }
        }
        return totalProfit;
    }
}
