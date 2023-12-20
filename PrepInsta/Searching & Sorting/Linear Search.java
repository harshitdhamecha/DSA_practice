import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

// printing an reversed array using recursion
public class Main {
    public static void main(String[] args)  {
        int[] arr = {8,6,9,1,2,1};
        int n = 1;
        for(int i = 0; i < arr.length;i++) {
            if (arr[i] == n) {
                System.out.println("index is " + i);
                return; // add this return in order to stop at the first occurence
            }

        }
    }

}
