import java.util.*;

public class BinarySearch {
    static int binSearch(int[] arr, int x) {
        int l = 0, r = arr.length - 1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) return mid;
            if (arr[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9};
        System.out.println(binSearch(arr, 7));
    }
}
