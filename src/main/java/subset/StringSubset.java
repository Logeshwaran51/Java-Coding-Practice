package subset;

import java.util.ArrayList;

public class StringSubset {

    public static void main(String[] args) {
        
        String s = "abc";

        ArrayList<String> result = new ArrayList<>();

        stringSubset(result,"", s);

        System.out.println(result);

        ArrayList<String> res = stringSubsetReturn("", s);

        System.out.println(res);
    }

    private static void stringSubset(ArrayList<String> result, String p, String up) {
        if(up.isEmpty()){
            result.add(p);
            return;
        }

        char ch = up.charAt(0);
        stringSubset(result, p+ch, up.substring(1));
        stringSubset(result, p, up.substring(1));
    }

    private static ArrayList<String> stringSubsetReturn(String p, String up) {

        ArrayList<String> temp = new ArrayList<>();
        if(up.isEmpty()){
            temp.add(p);
            return temp;
        }

        char ch = up.charAt(0);
        ArrayList<String> left = stringSubsetReturn( p+ch, up.substring(1));
        ArrayList<String> right = stringSubsetReturn( p, up.substring(1));
        left.addAll(right);
        return left;
    }
}
