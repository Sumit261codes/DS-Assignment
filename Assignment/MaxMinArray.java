import java.util.*;

public class MaxMinArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();

        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);
    }
}
