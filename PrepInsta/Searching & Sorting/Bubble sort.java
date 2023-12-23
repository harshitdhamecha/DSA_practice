import java.util.*;

// Bubble sort
public class Main {
    public static void main(String[] args)  {
        int[] arr = {8,6,9,1,2,10,30,40,50,60,30,20};
        int n = arr.length;
        for(int i = 1; i<n;i++){
            // here the j is less than n-i as the bubble sort keeps sending the highest integer towards the right end
            // This right end pointer is shifted to the left with the help of n-i
            for(int j = 0; j<n-i;j++){
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

}
