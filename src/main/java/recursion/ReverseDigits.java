package recursion;

public class ReverseDigits {
    public static void main(String[] args) {
        int n = 517;
        int rev = 0;
        System.out.println(reverseDigits(n, rev));
    }

    private static int reverseDigits(int n, int rev) {
        if (n == 0 )
            return rev;
        return reverseDigits(n/10, (rev*10) + n%10);
    }
}
