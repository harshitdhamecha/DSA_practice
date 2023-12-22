import java.util.*;

// Binary search
// making it into a seperate method like BinarySearch() would allow it for the case of element not found
public class Main {
    public static void main(String[] args)  {
        int[] arr = {8,6,9,1,2,10,30,40,50,60,30,20};
        // ensuring the array is sorted
        int n = 50;
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;

        while(left < right){
            int mid = (left+right)/2;
            if(arr[mid] > n){
                right = mid - 1;
            }else if(arr[mid] < n){
                left = mid + 1;
            }else{
                System.out.println(mid);
                break;
            }
        }

    }

}
