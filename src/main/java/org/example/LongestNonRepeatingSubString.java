package org.example;
import java.util.LinkedHashSet;
import java.util.Scanner;
import java.util.Set;

public class LongestNonRepeatingSubString {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.next();

        int max = 0;

        int i = 0, j;

        Set<Character> set = new LinkedHashSet<>();
        StringBuilder sb = new StringBuilder();

        for (j=0;j<s.length();j++){
            while (set.contains(s.charAt(j))){
                set.remove(s.charAt(i));
                i++;
            }
            set.add(s.charAt(j));
            if(max<set.size()){
                sb.setLength(0);
                max = set.size();

                for (char c : set){
                    sb.append(c);
                }
            }
        }

        System.out.println(sb + " " +max);
    }
}
