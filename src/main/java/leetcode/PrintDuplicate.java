package leetcode;

import java.util.*;

public class PrintDuplicate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("String: ");

        String s = scanner.next();

        Set<Character> set = new LinkedHashSet<>();

        System.out.println("Using Set");
        for (char c : s.toCharArray()){
            if(set.contains(c)){
                System.out.println(c);
            }else {
                set.add(c);
            }
        }

        System.out.println("Using Map");
        Map<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        for (char c : s.toCharArray()) {
            if(map.get(c) >1 ){
                System.out.println(c);
                map.put(c, 0);
            }
        }



    }
}
