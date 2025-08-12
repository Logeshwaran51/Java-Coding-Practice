package streams;

import java.util.Arrays;
import java.util.List;

public class SumAllList {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5);

        long res = nums.stream().reduce(0, Integer::sum);
        System.out.println(res);

    }
}
