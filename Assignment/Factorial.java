import java.util.*;

public class Factorial {
    static int factRec(int n) {
        if (n == 0) return 1;
        return n * factRec(n - 1);
    }

    static int factIter(int n) {
        int f = 1;
        for (int i = 1; i <= n; i++) f *= i;
        return f;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println("Iterative: " + factIter(n));
        System.out.println("Recursive: " + factRec(n));
    }
}
