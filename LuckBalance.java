import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/luck-balance/problem
    Problem: If Lena loses no more than K important contests, what is the maximum amount of luck she can have after competing in all the preliminary contests? This value may be negative.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class LuckBalance {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        int total = 0;
        List<Integer> importantContests = new ArrayList<>();
        for (int i=0; i<n; i++){
            int luck = scanner.nextInt();
            int importance = scanner.nextInt();
            total += luck;
            if (importance == 1) {
                importantContests.add(luck);
            } 
        }
        Collections.sort(importantContests);
        int lf = 0;
        int mustWinImprCount = importantContests.size() - k;
        for (int i=0; i<mustWinImprCount; i++){
            lf += importantContests.get(i);
        }
        int result = total - 2*lf;
        System.out.println(result);
    }
}