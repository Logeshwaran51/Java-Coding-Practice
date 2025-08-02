package recursion;

public class BinarySearch {

    public static void main(String[] args) {

        int [] arr = {1, 2, 3, 4, 5, 6, 7};
        int find = 7;
        int start = 0;
        int end = arr.length - 1;
        int res = binarySearch(arr, start, end, find);
        if (res == 0){
            System.out.println(-1);
        }else {
            System.out.println(res);
        }

    }

    private static int binarySearch(int[] arr, int start, int end, int find) {
        int mid = (start+end) / 2;
        if(start > end  )
            return 0;
        if(arr[mid] == find)
            return mid;
        if(find > arr[mid])
            return binarySearch(arr, mid+1, end,find);
        else
            return binarySearch(arr,start, mid-1, find);
    }
}
