public class FirstLastOccurrence {
    static int firstOcc(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) { ans = mid; r = mid - 1; }
            else if (arr[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }

    static int lastOcc(int[] arr, int x) {
        int l = 0, r = arr.length - 1, ans = -1;
        while (l <= r) {
            int mid = (l + r) / 2;
            if (arr[mid] == x) { ans = mid; l = mid + 1; }
            else if (arr[mid] < x) l = mid + 1;
            else r = mid - 1;
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 4, 4, 7};
        System.out.println(firstOcc(arr, 4));
        System.out.println(lastOcc(arr, 4));
    }
}
