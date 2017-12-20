import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem
    Problem: Fibonacci
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CtciFibonacciNumbers {

    public static int fibonacci(int n) {
        // Complete the function.
        if (n <= 1) 
            return n;
        return fibonacci(n-1) + fibonacci(n-2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        scanner.close();
        System.out.println(fibonacci(n));
    }
}
