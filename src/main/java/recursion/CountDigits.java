package recursion;

public class CountDigits {

    public static void main(String[] args) {

        int num = 12345;
        int count = 0;
        System.out.println(digitCount(num));
    }

    private static int digitCount(int num) {
        if (num == 0)
            return 0;
        return 1 + digitCount(num/10);
    }
    /*
    private static void digitCount(int num,  int count) {
        if(num == 0){
            System.out.println(count);
            return;
        }
        count ++;
        digitCount(num/10, count);
    }
     */
}
