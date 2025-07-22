package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSum {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Index:");
        int index = scanner.nextInt();

        System.out.print("Array Elements:");
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            array.add(scanner.nextInt());
        }

        System.out.print("Target:");
        int target = scanner.nextInt();

        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < index; i++) {

            int diff = target - array.get(i);

            if(map.containsKey(diff)){
                System.out.println(map.get(diff) +" "+ i);
                return;
            }

            map.put(array.get(i), i);

        }
    }
}
