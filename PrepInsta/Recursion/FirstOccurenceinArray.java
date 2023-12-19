/*              Problem Statement:
                                      You are given an array of integers of length n and an integer that is to be searched for it first occurrence in the array. You are required to print the index of the first occurrence of an element in the array else print -1.
                                      
                                      Sample Input: 5 3, 6, 3, 4, 5 3
                                      Sample Output: 1

  */

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// printing an reversed array using recursion
public class Main {
    public static void main(String[] args)  {
        int[] arr = {8,6,9,1,2,1};
        int n = 5;
        int ans = first(arr,0,1);
        System.out.println(ans);
    }

    public static int first(int[] arr, int idx, int num){
        if(idx == arr.length){
            return -1;
        }
        if(num == arr[idx]){
            return idx;
        }

        return first(arr,idx+1,num);
    }
}
