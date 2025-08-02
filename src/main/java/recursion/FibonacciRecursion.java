package recursion;

import java.util.Scanner;

public class FibonacciRecursion {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int f1 = 0;
        int f2 = 1;
        System.out.println(f1);
        System.out.println(f2);
        fibonnaci(f1, f2, n);

        for (int i = 0; i <= n; i++) {
            System.out.println(loop(i));
        }
    }


    public static void fibonnaci(int f1, int f2, int n){
        if(f2 == n)
            return;
        System.out.println(f1+f2);
        fibonnaci(f2, f1+f2, n);
    }
    private static int loop(int n) {
        if(n<2)
            return n;
        return loop(n-1)+ loop(n-2);
    }
}
