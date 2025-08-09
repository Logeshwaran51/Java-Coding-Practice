package recursion;

public class ArraySortedCheck {


    private static boolean checkSorted(int[] arr, int i) {

        if(i+1 == arr.length)
            return true;

        if(arr[i] > arr[i+1])
            return false;

        return checkSorted(arr, i+1);
    }

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4};

        if (checkSorted(arr, 0)){
            System.out.println("Sorted");
        }else {
            System.out.println("Not Sorted");
        }
    }




}
