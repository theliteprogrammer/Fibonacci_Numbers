import java.util.Scanner;

public class Main {
    private static long calc_fib(int n) {
        if (n <= 1) {
            return n;
        } else {
            long[] array = new long[n + 1];
            array[0] = 0L;
            array[1] = 1L;

            for(int i = 2; i < array.length; ++i) {
                array[i] = array[i - 2] + array[i - 1];
            }

            return array[n];
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        System.out.println(calc_fib(n));
    }
}
