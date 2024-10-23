package src;

import java.util.Arrays;

public class ReshapeTheMatrix566 {

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        int n = mat[0].length;
        if (mat.length * n != r*c)
            return mat;

        int[][] res = new int[r][c];
        int row = 0, col = 0;
        
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                res[i][j] = mat[row][col];
                col++;
                if (col == n) {
                    col = 0;
                    row++;
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[][] mat = {{1,2},{3,4}};
        int r = 1, c = 4;
        int[][] result = matrixReshape(mat, r, c);
        System.out.println(Arrays.deepToString(result));

        int r2 = 2, c2 = 4;
        int[][] result2 = matrixReshape(mat, r2, c2);
        System.out.println(Arrays.deepToString(result2));
    }
}
