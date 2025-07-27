package org.example;

import java.util.Scanner;

public class SubString {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");

        String s1 = scanner.next();

        System.out.print("String: ");

        String s2 = scanner.next();

        s1 = s1 + s2 ;

        s2 = s1.substring(0,s1.length()-s2.length());

        s1 = s1.substring(s2.length());

        System.out.println(s1 + " "+ s2);


    }
}

