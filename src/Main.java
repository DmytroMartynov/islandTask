public class Main {

    public static void main(String[] args) {
        int[][] array = {{0, 1,},
                         {1, 1,},

        };
        System.out.println(islandPerimeter(array));

    }

   public static int islandPerimeter( int[][] grid) {

        int counterOfPerimeter = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] == 1) {
                    int f = 4;
                    if (i-1>=0 && grid[i-1][j] == 1)
                        f--;
                    if (i+1 < grid.length && grid[i+1][j] == 1)
                        f--;
                    if (j-1>=0 && grid[i][j-1] == 1)
                        f--;
                    if (j+1 < grid[0].length && grid[i][j+1] == 1)
                        f--;
                    counterOfPerimeter+=f;
                }
            }
        }
        return counterOfPerimeter;

    }


}

