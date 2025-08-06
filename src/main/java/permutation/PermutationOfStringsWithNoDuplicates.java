package permutation;
import java.util.HashSet;
import java.util.Set;

public class PermutationOfStringsWithNoDuplicates {
    public static void main(String[] args) {
        String str = "aac";

        Set<String> result = new HashSet<>();
        StringBuilder stringBuilder = new StringBuilder();
        boolean [] visited = new boolean[str.length()];
        backtrackString(result, stringBuilder, str, visited);

        System.out.println(result);
    }

    private static void backtrackString(Set<String> result, StringBuilder s, String str, boolean[] visited) {

        if(s.length() == str.length()){
            result.add(String.valueOf(s));
            return;
        }

        for (int i = 0; i < str.length(); i++) {
           if(visited[i])
               continue;
           visited[i] = true;
            s.append(str.charAt(i));
            backtrackString(result, s , str, visited);
            visited[i] = false;
            s.deleteCharAt(s.length() - 1);

        }

    }
}
