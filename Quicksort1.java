import java.util.*;

/*
	Author: Igor Kitaychik 
	Url: https://www.hackerrank.com/challenges/quicksort1/problem
    Problem: Given AR and p=AR[0], partition AR into left, right, equal and using the Divide instructions above. Then print each element in left followed by each element in equal, followed by each element in right on a single line. Your output should be space-separated.
	Note: Refer to the above URL for the detailed description of the problem. 
*/

public class Quicksort1 {
       
    static void partition(int[] ar, int left, int right) {
            int i = left, j = right;
            int pivot = ar[(left+right)/2];
            int tmp;
            while(i<=j) {
                while(ar[i] < pivot) 
                    i++;
                while(ar[j] > pivot)
                    j--;
                if(i<=j) {
                    tmp = ar[i];
                    ar[i] = ar[j];
                    ar[j] = tmp;
                    i++;
                    j--;
                }
            }
            
            if(left<j)
                partition(ar,left,j);
            if(i < right)
                partition(ar,i,right);
    }   
 
	static void printArray(int[] ar) {
         for(int n: ar){
            System.out.print(n+" ");
         }
           System.out.println("");
    }
       
    public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
           int n = in.nextInt();
           int[] ar = new int[n];
           for(int i=0;i<n;i++){
              ar[i]=in.nextInt(); 
           }
           partition(ar, 0, ar.length - 1);
          printArray(ar);
       }    
   }
