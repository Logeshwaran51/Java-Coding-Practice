package recursion;

public class SumOfDigits {

    public static void main(String[] args) {

        int num = 123;

        System.out.println(sumOfDigits(num));
    }

    private static int sumOfDigits(int num) {
        if(num < 10)
            return num;

        return (num % 10) + sumOfDigits(num/10);
    }
}
