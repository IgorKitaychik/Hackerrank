import java.io.*;
import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/time-conversion/problem
    Problem: Given a time in 12-hour AM/PM format, convert it to military (24-hour) time.
	Note: Refer to the above URL for the detailed description of the problem.
*/

public class TimeConversion {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String time12 = in.nextLine().toString();
        int time12Hour = Integer.parseInt(time12.split(":")[0].toString());
        String time12Min = time12.split(":")[1].toString() + ":" + time12.split(":")[2].toString().replace("PM","").replace("AM","");
        
        if(time12.contains("AM")) {
            if (time12Hour >= 1 && time12Hour <= 11) {
                System.out.print("0" + time12Hour + ":" + time12Min);
            }
            else if (time12Hour == 12) {
                System.out.print("00:"+ time12Min);
            }
        } 
        else if (time12.contains("PM")) {
            //System.out.print("PM");
            if (time12Hour == 12) {
                System.out.print(time12.replace("PM",""));
            }
            else if (time12Hour >= 1 && time12Hour <= 11) {
                time12Hour = time12Hour + 12;
                System.out.print(time12Hour + ":" + time12Min);
            }
        }
    }
}