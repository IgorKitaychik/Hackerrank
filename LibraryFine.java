import java.io.*; 
import java.util.*; 
import java.text.*; 
import java.math.*; 
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/library-fine/problem
    Problem: Print a single integer denoting the library fine for the book received as input. 
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class LibraryFine {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int aDay = sc.nextInt();
		int aMonth = sc.nextInt();
		int aYear = sc.nextInt();
		int eDay = sc.nextInt();
		int eMonth = sc.nextInt();
		int eYear = sc.nextInt();
		int fine = 0;
		if(aYear == eYear) {
			if(aMonth == eMonth) {
				if(aDay > eDay) {
				    fine = 15 * (aDay - eDay);
                }
			} else if(aMonth > eMonth) fine = 500 * (aMonth - eMonth);
		} else if(aYear > eYear) fine = 10000 * (aYear - eYear);
		System.out.println(fine);
		sc.close();
    }

}