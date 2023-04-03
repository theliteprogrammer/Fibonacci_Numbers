import java.util.Scanner;

public class Fibonacci {
    /**
     *
     * @param n - the number of terms in fibonacci sequence
     * @return array[n - 1] - the last element in the sequence of fibonacci numbers
     */
    private static long calc_fib(int n) {
        if(n <= 1){
            return n;
        }
        // create an array of size n
        long[] array = new long[n + 1];
        array[0] = 0;
        array[1] = 1;
        // go through each index and sum up the previous two numbers
        for(int i = 2; i < array.length; i++){
            array[i] = array[i - 2] + array[i - 1];
        }
        return array[n];
    }

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(calc_fib(n));
    }
}
