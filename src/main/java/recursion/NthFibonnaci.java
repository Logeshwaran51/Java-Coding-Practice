package recursion;

import java.util.Scanner;

public class NthFibonnaci {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(nthFibonnaci(n));
    }

    private static int nthFibonnaci(int n) {
        if(n<2)
            return n;
        return nthFibonnaci(n-1)+ nthFibonnaci(n-2);
    }
}
