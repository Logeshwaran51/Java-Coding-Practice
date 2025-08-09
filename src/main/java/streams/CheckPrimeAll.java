package streams;

import java.util.Arrays;
import java.util.List;

public class CheckPrimeAll {

    public static boolean checkPrime(int number){
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {

        List<Integer> prime = Arrays.asList(1,2,3,4,5,7,8,11);

        boolean res = prime.stream().anyMatch(CheckPrimeAll::checkPrime);
        System.out.println(res);
    }
}
