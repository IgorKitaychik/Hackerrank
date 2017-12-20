import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/grading/problem
    Problem: Calculate grades according to the grading policy of the HackerLand University.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class GradingStudents {
	static int[] solve(int[] grades){
        // Complete this function
        for(int i=0; i<grades.length; i++) {
            if(grades[i] >= 38) {
                int temp = grades[i];
                while(temp / 5 != 0) {
                    temp++;
                    if(temp % 5 == 0){
                        break;
                    }
                }
                if(temp - grades[i] < 3) {
                    grades[i] = temp;
                } 
            }
        }
        return grades;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] grades = new int[n];
        for(int grades_i=0; grades_i < n; grades_i++){
            grades[grades_i] = in.nextInt();
        }
        int[] result = solve(grades);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
    }
}
