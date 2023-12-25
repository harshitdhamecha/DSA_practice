import java.util.*;

// quick sort
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,45,2,51,235,13,123,4,1};
        int low = 0;
        int high = arr.length-1;
        quicksort(arr, low, high);
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }
    }
    // using recursion to go through every point in the left partitioned array and the right partitioned array.
    public static void quicksort(int[] arr, int low, int high){
        if (low < high) {
            int indexpi = partition(arr,low,high);
            quicksort(arr,low,indexpi-1);
            quicksort(arr,indexpi+1,high);
        }
    }
    //going to partition the array using the pivot as the partitioning point
    public static int partition(int[] arr, int low, int high){
        int swapindex = low-1;
        int pivot = arr[high];
        for(int i = low;i<high;i++){
            if(arr[i]<pivot){
                swapindex++;
                int temp = arr[i];
                arr[i] = arr[swapindex];
                arr[swapindex] = temp;

            }
        }
        int temp = arr[swapindex+1];
        arr[swapindex+1] = pivot;
        arr[high] = temp;

        return swapindex+1;
    }

}
