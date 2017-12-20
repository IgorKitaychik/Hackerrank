import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/cats-and-a-mouse/problem
    Problem: On a new line for each query, print Cat A if cat A catches the mouse first, Cat B if cat B catches the mouse first, or Mouse C if the mouse escapes.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class CatsAndAMouse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            int x = in.nextInt();
            int y = in.nextInt();
            int z = in.nextInt();
            if(Math.abs(x-z) == Math.abs(y-z)) 
                System.out.println("Mouse C");
            else if (Math.abs(z-x)>Math.abs(y-z))
                System.out.println("Cat B");
            else if (Math.abs(z-x)<Math.abs(y-z))
                System.out.println("Cat A");
        }
    }
}
