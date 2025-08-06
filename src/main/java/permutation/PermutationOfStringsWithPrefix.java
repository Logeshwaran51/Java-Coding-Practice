package permutation;

import java.util.ArrayList;

public class PermutationOfStringsWithPrefix {

    public static void main(String[] args) {

        String str = "abc";
        char prefix = 'b';

        ArrayList<String> result = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean [] visited = new boolean[str.length()];
        backtrack(result, stringBuilder, str, visited, prefix);
        System.out.println(result);
    }

    private static void backtrack(ArrayList<String> result, StringBuilder stringBuilder, String str, boolean[] visited, char prefix ) {

        if(stringBuilder.length() == str.length()){
            result.add(String.valueOf(stringBuilder));
            return;
        }

        for (int i = 0; i < str.length(); i++) {
            if(stringBuilder.isEmpty() && str.charAt(i) !=prefix )
                continue;
            if(visited[i])
                continue;
            visited[i] = true;
            stringBuilder.append(str.charAt(i));
            backtrack(result, stringBuilder, str, visited, prefix);
            visited[i] = false;
            stringBuilder.deleteCharAt(stringBuilder.length() - 1);
        }
    }
}
