package permutation;

import java.util.ArrayList;

public class PermutationOfStringsFixedLength {

    public static void main(String[] args) {

        String str = "abcd";
        int len = 2;
        ArrayList<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean [] visited = new boolean[str.length()];
        backtrack(result, stringBuilder, str, visited, len);
        System.out.println(result);
    }

    private static void backtrack(ArrayList<String> result, StringBuilder stringBuilder, String str, boolean[] visited ,int len){

        if(stringBuilder.length() == len){
            result.add(String.valueOf(stringBuilder));
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if(visited[i])
                continue;
            visited[i] = true;
            stringBuilder.append(str.charAt(i));
            backtrack(result, stringBuilder, str, visited, len);
            visited[i] = false;
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
