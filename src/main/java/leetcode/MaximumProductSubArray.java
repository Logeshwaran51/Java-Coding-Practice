package leetcode;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumProductSubArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Index:");
        int index = scanner.nextInt();

        System.out.print("Array Elements:");
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            array.add(scanner.nextInt());
        }

        int left = 1;
        int right = 1;

        int maxProd = Integer.MIN_VALUE;

        int i = 0;
        int j = index -1;
        while (i < index && j >=0 ){

            left = left * array.get(i);
            right = right * array.get(j);

            if(left == 0){
                left = 1;
            }
            if(right == 0){
                right = 1;
            }

            maxProd = Math.max(maxProd, Math.max(left, right) );
            i++;
            j--;
        }

        System.out.println(maxProd);
    }
}
