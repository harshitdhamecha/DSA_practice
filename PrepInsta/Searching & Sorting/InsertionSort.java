import java.util.*;

// Insertion sort
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,45,2,51,235,13,123,4,1};
        for(int i = 1; i<arr.length;i++){
            int j = i-1;
            while(j>=0){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }else{
                    break;
                }
                j--;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }

}
