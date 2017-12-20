import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/beautiful-binary-string/problem
    Problem: Print the minimum number of steps needed to make the string beautiful.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class BeautifulBinaryString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); scan.nextLine();
        char[] s = scan.nextLine().toCharArray();
        int count = 0;
        boolean isAdjacent = false;
        if(s.length == 3 && s[0] == '0' && s[1] == '1' && s[2] == '0') count = 1;
        else if(s.length < 3) count = 0;
        else if(s.length > 3) {
            for(int i=0; i<n-2; i++) {
                if(s[i] == '0' && s[i+1] == '1' && s[i+2] == '0') {
                    if(!isAdjacent) {
                        count++;
                        isAdjacent = true;
                    } else isAdjacent = false;
                    i += 1;
                } else isAdjacent = false;
            }
        }
        System.out.println(count);
    }
}