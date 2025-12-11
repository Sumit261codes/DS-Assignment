import java.util.*;

public class LinearSearch2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        int x = sc.nextInt();

        boolean found = false;
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                if (a[i][j] == x) {
                    System.out.println("Found at (" + i + "," + j + ")");
                    found = true;
                }

        if (!found) System.out.println("Not Found");
    }
}
