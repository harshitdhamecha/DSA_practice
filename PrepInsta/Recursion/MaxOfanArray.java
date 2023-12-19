/*        Problem Statement:
                                You are given an array with n number of elements. You have to print the maximum of an array using a recursion function.
                                
                                Sample Input: 5
                                8. 6, 9, 1, 2
                                Sample Output: 9

*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// printing an reversed array using recursion
public class Main {
    public static void main(String[] args)  {
        int[] arr = {8,6,9,1,2};
        int n = 5;
        int ans = maxe(arr,0);
        System.out.println(ans);
    }

    public static int maxe(int[] arr, int i){

        if(i == arr.length){
            return 0;
        }
        int max = maxe(arr,i+1);
        if(max < arr[i]){
            max = arr[i];
        }
        return max;



    }
}
