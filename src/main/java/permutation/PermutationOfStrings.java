package permutation;

import java.util.ArrayList;

public class PermutationOfStrings {


    public static void main(String[] args) {
        String str = "abc";

        ArrayList<StringBuilder> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        backtrackString(result, stringBuilder, str);

        System.out.println(result);
    }

    private static void backtrackString(ArrayList<StringBuilder> result, StringBuilder s, String str) {

        if(s.length() == str.length()){
            result.add(new StringBuilder(s));
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if(s.toString().contains(String.valueOf(str.charAt(i)))){
                continue;
            }
            s.append(str.charAt(i));
            backtrackString(result, s , str);
            s.deleteCharAt(s.length() - 1);

        }

    }


}
