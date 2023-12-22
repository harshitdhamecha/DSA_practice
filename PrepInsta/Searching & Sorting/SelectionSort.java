import java.util.*;

// Selection sort
public class Main {
    public static void main(String[] args)  {
        int[] arr = {8,6,9,1,2,10,30,40,50,60,30,20};
           for(int i = 0; i < arr.length;i++){
            for(int j = i+1; j<arr.length;j++){
                if(arr[j] < arr[i]){
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length;i++){
            System.out.print(arr[i] + " ");
        }

    }

}
