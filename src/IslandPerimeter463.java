package src;

public class IslandPerimeter463 {

    public static int islandPerimeter(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;
        int islandPerimeter = 0;
        int count = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (grid[i][j] == 1) {
                    count++;
                    int left = j - 1;
                    int right = j + 1;
                    int top = i - 1;
                    int bottom = i + 1;
                    if (left < 0 || grid[i][left] != 1)
                        islandPerimeter += 1;
                    if (right >= col || grid[i][right] != 1)
                        islandPerimeter += 1;
                    if (top < 0 || grid[top][j] != 1)
                        islandPerimeter += 1;
                    if (bottom >= row || grid[bottom][j] != 1)
                        islandPerimeter += 1;
                    System.out.println(i + " " + j + " count: " + count + " sides: " + islandPerimeter);
                }
            }
        }
        return islandPerimeter;
    }

    public static void main(String[] args) {
        int[][] grid = { {0,1,0,0}, {1,1,1,0}, {0,1,0,0}, {1,1,0,0} };
        System.out.println(islandPerimeter(grid));

        int[][] grid1 = {{1}};
        System.out.println(islandPerimeter(grid1));

        int[][] grid2 = {{1, 0}};
        System.out.println(islandPerimeter(grid2));
    }
}
