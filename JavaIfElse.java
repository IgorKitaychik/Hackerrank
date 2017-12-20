import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/java-if-else/problem
    Problem: Print Weird if the number is weird (n is odd, n is even in the inclusive range, etc...); otherwise, print Not Weird.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class JavaIfElse {

	public static void main(String[] args) {

	Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
	String ans = "";
	//even
	if (n % 2 == 0 && (n >= 2 && n <= 5)) {
		ans = "Not Weird";
	} else if (n % 2 == 0 && (n >= 6 && n <= 20)) {
		ans = "Weird";
	} else if (n % 2 == 0 && (n > 20)) {
		ans = "Not Weird";
	} else {
		ans = "Weird";
	}
	System.out.println(ans);
		
	}
}
