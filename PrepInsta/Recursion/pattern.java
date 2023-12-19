/* Problem Statement:
                                        Sample Input 1 —  1
                                        Sample Output 1 — 1 1 1  
                                        
                                        Sample Input 2 —  2
                                        Sample Output 2 —  2 1 1 1 2 1 1 1 2  
                                        
                                        Sample Input 2 —  3
                                        Sample Output 3 — 3 2 1 1 1 2 1 1 1 2 3 2 1 1 1 2 1 1 1 2 3  
                                        
                                        Figure out the pattern and solve it using a recursive function to achieve the above for any positive number n.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// printing an reversed array using recursion
public class Main {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        printpattern(n);
    }

    public static void printpattern(int n){
        if(n==0){
            return;
        }
        System.out.print(n+" ");
        printpattern(n-1);
        System.out.print(n+" ");
        printpattern(n-1);
        System.out.print(n+" ");
    }
}
