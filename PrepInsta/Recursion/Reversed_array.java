import java.util.ArrayList;
import java.util.Collections;

// printing an reversed array using recursion
public class Main {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        int size = arr.length;
        printarray(arr,size,0);

    }


    public static void printarray(int[] k, int size, int i) {

        if(i==size) {
            return;
        }

        System.out.print(k[size-i-1] + " ");
        printarray(k,size,++i);
    }
}
