import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/alice-and-bobs-silly-game/problem
    Problem: Alice and Bob play G games. Given the value of N for each game, print the name of the game's winner on a new line. If Alice wins, print Alice; otherwise, print Bob
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class AliceAndBobsSillyGame {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int g = in.nextInt();
        
        Set<Integer> primeSet = new HashSet<>();
        for(int i=1; i<=100000; i++) {
            if(isPrime(i))
                primeSet.add(i);
        }
        
        for(int a0 = 0; a0 < g; a0++){
            int n = in.nextInt();
            // your code goes here
            playGame(n,primeSet);
        }
    }
    
    public static boolean isPrime(int n) {
        if (n == 1)
            return false;
        
        if (n == 2)
            return true;
        
        //check if n is a multiple of 2
        if (n % 2 == 0) {
            return false;
        }
        //if not, then just check the odds
        for (int i = 3; i * i <= n; i += 2) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    public static void playGame(int n, Set<Integer> s) {
        
            int count = 0;
            for(int i=1;i<=n;i++) {
                if(s.contains(i))
                    count++;
            }
            if(count % 2 == 0) {
                System.out.println("Bob");          
            } else {
                System.out.println("Alice");
            }
        
    } 
}
