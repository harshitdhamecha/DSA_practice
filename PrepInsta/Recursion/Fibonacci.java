import java.util.ArrayList;
import java.util.Collections;

// fibonacci using recursion
public class Main {
    public static void main(String[] args) {
        System.out.println(fib(5));
    }


    public static int fib(int k) {
        if (k <= 1) {
            return k;
        } else {
            return fib(k-1) + fib(k-2);
        }
    }
}
