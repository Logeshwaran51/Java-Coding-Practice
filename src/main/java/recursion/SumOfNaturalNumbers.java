package recursion;

public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        int n = 2;
        System.out.println(natural(n));
    }

    private static int natural(int n) {
        if (n < 2)
            return 1;
        return n + natural(n-1);
    }
}
