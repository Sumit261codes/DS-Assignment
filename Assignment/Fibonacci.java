import java.util.*;

public class Fibonacci {
    static int fibRec(int n) {
        if (n <= 1) return n;
        return fibRec(n - 1) + fibRec(n - 2);
    }

    static void fibIter(int n) {
        int a = 0, b = 1;
        System.out.print(a + " " + b + " ");
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.print(c + " ");
            a = b; b = c;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.print("Iterative: ");
        fibIter(n);

        System.out.print("\nRecursive: ");
        for (int i = 0; i < n; i++) System.out.print(fibRec(i) + " ");
    }
}
