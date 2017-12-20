import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
    Problem: You are given an array, scores, of monotonically decreasing leaderboard scores, and another array, alice, of Alice's cumulative scores for each level of the game. You must print m integers. The Jth integer should indicate the current rank of alice after passing the level.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class ClimbingTheLeaderboard {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int scores_i;
        int prev_score = in.nextInt();
        int curr_score;
        List<Integer> dense_ranks = new ArrayList<>();
        dense_ranks.add(prev_score);

        for (scores_i = 1; scores_i < n; scores_i++) {
            curr_score = in.nextInt();
            if (curr_score < prev_score) {
                dense_ranks.add(curr_score);
                prev_score = curr_score;
            }
        }

        int m = in.nextInt();
        int alice_i;
        int alice_score;
        int ranks_i = dense_ranks.size() - 1;

        for (alice_i = 0; alice_i < m; alice_i++) {
            alice_score = in.nextInt();
            while (ranks_i > 0 && alice_score > dense_ranks.get(ranks_i)) {
                ranks_i--;
            }

            if (alice_score >= dense_ranks.get(ranks_i)) {
                System.out.println(ranks_i + 1);
            } else {
                System.out.println(ranks_i + 2);
            }
        }
        in.close();
    }
}
