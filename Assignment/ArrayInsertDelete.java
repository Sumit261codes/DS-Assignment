import java.util.*;

public class ArrayInsertDelete {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[100];
        int n, pos, val;

        System.out.print("Enter number of elements: ");
        n = sc.nextInt();

        System.out.println("Enter array:");
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter position to insert: ");
        pos = sc.nextInt();
        System.out.print("Enter value: ");
        val = sc.nextInt();

        for (int i = n - 1; i >= pos; i--) arr[i + 1] = arr[i];
        arr[pos] = val;
        n++;

        System.out.println("Array after insertion:");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");

        System.out.print("\nEnter position to delete: ");
        pos = sc.nextInt();

        for (int i = pos; i < n - 1; i++) arr[i] = arr[i + 1];
        n--;

        System.out.println("Array after deletion:");
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }
}
