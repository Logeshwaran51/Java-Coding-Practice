package org.example;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicatesFromSortedArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Index:");
        int index = scanner.nextInt();

        System.out.print("Array Elements:");
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            array.add(scanner.nextInt());
        }

        Set<Integer> set = new LinkedHashSet<>(array);

        System.out.println(set);
        System.out.println(set.size());
    }
}
