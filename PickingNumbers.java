import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/picking-numbers/problem
    Problem: Given an array of integers, find and print the maximum number of integers you can select from the array such that the absolute difference between any two of the chosen integers is =< 1.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class PickingNumbers {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            arr[a_i] = in.nextInt();
        }
        Arrays.sort(arr);
        Map<Integer,Integer> max = new LinkedHashMap<>();
        for(int i=0; i<arr.length; i++) {
            if(max.get(arr[i])==null) {
                max.put(arr[i],1);
            } else {
                max.put(arr[i],max.get(arr[i])+1);
            }
        }
        int totalSize = max.size(), t = 0, totalMax = -1;
        Set<Map.Entry<Integer, Integer>> maxSet = max.entrySet();
        Map.Entry<Integer, Integer> currentElem;
        Map.Entry<Integer, Integer> nextElem;
        while(t < totalSize-1) {
            currentElem = (Map.Entry<Integer, Integer>) maxSet.toArray()[t];
            nextElem = (Map.Entry<Integer, Integer>) maxSet.toArray()[t+1];

            if(Math.abs(currentElem.getKey() - nextElem.getKey())==0 || Math.abs(currentElem.getKey() - nextElem.getKey())==1) {
                if(currentElem.getValue() + nextElem.getValue() > totalMax)
                    totalMax = currentElem.getValue() + nextElem.getValue();
            }
            t++;
        } 
        for(Map.Entry<Integer, Integer> e : max.entrySet()) {
            if(e.getValue() > totalMax)
                totalMax = e.getValue();
        }
        System.out.println(totalMax);
    }
}
