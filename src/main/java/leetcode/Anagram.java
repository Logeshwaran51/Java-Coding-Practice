package leetcode;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Anagram {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String s  = scanner.next();
        String s1 = scanner.next();

        Map<Character, Integer> map = new HashMap<>();

        if(s.length() != s1.length()){
            System.out.println("Not Anagram");
        }else{

            for (int i = 0; i < s.length(); i++) {

                if(map.containsKey(s.charAt(i))){
                    map.put(s.charAt(i), map.get(s.charAt(i))-1);
                }else {
                    map.put(s.charAt(i), 1);
                }
                if(map.containsKey(s1.charAt(i))){
                    map.put(s1.charAt(i), map.get(s1.charAt(i))-1);
                }else {
                    map.put(s1.charAt(i), 1);
                }
            }
        }

        for(int val : map.values()){
            if(val != 0){
                System.out.println("Not Anagram");
                return;
            }
        }
        System.out.println("Anagram");
    }

}
