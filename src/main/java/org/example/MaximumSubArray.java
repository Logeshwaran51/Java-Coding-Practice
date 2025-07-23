package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class MaximumSubArray {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Index:");
        int index = scanner.nextInt();

        System.out.print("Array Elements:");
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            array.add(scanner.nextInt());
        }

        int currentSum = array.get(0);
        int maxSum = array.get(0);

        for (int i = 0; i < index; i++) {

            currentSum = Math.max(array.get(i), currentSum+ array.get(i));

            maxSum = Math.max(currentSum, maxSum);

        }
        System.out.println(maxSum);
    }
}
