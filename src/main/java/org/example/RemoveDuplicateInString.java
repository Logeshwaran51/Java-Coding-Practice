package org.example;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RemoveDuplicateInString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");

        String s = scanner.next();

        Set<Character> set = new HashSet<>();
        for (char c : s.toCharArray()) {
            set.add(c);
        }

        System.out.println(set);


    }

}
