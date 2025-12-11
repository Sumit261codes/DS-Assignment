import java.util.*;

public class MatrixAddMultiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int r = sc.nextInt(), c = sc.nextInt();
        int[][] a = new int[r][c];
        int[][] b = new int[r][c];

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                a[i][j] = sc.nextInt();

        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                b[i][j] = sc.nextInt();

        int[][] sum = new int[r][c];
        for (int i = 0; i < r; i++)
            for (int j = 0; j < c; j++)
                sum[i][j] = a[i][j] + b[i][j];

        System.out.println("Addition:");
        for (int[] row : sum) System.out.println(Arrays.toString(row));
    }
}
