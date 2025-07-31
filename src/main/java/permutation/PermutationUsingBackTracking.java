package permutation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PermutationUsingBackTracking {

    private static void backtrack(ArrayList<List<Integer>> result, ArrayList<Integer> tempList, ArrayList<Integer> array) {

       if (tempList.size() == array.size()){
            result.add(new ArrayList<>(tempList));
            return;
        }
        for (int num: array){
            if(tempList.contains(num))
                continue;
            tempList.add(num);
            backtrack(result, tempList, array);
            tempList.remove(tempList.size() -1 );
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Index:");
        int index = scanner.nextInt();

        System.out.print("Array Elements:");
        ArrayList<Integer> array = new ArrayList<>();

        for (int i = 0; i < index; i++) {
            array.add(scanner.nextInt());
        }

        ArrayList<List<Integer>> resultList = new ArrayList<>();


        backtrack(resultList, new ArrayList<>(), array);


        System.out.println(resultList);
    }


}
