import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/angry-professor/problem
    Problem: A Discrete Mathematics professor has a class of N students. Frustrated with their lack of discipline, he decides to cancel class if fewer than K students are present when class starts. Given the arrival time of each student, determine if the class is canceled.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class AngryProfessor {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int T = scan.nextInt();
        for(int i=0; i<T; i++) {
            int N = scan.nextInt();
            int K = scan.nextInt();
            int count = 0;
            for(int j=0; j<N; j++) {
                if(scan.nextInt() <= 0)
                    count++;
            }
            if(count<K)
                System.out.println("YES");
            else if(count>=K)
                System.out.println("NO");
        }
    }
}