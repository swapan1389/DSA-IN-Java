public class Number_of_Islands {
public static void main(String[] args) {
    int[][] grid = {{1,1,0,0,0},
                        {1,1,0,0,0},
                        {0,0,1,0,0},
                        {0,0,0,1,1}};
        
    
int ans=0;
    for (int i = 0; i < grid.length; i++) {
        for (int j = 0; j < grid[0].length; j++) {
            if (grid[i][j] == 1) {
                dfs(grid, i, j);
                ans++;
            }
        }
    }

    System.out.println("The number of islands is = "+ ans);


    }

    public static void dfs(int[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= grid.length || j >=grid[0].length || grid[i][j]==0){
            return;
        }
        grid[i][j]=0;

        dfs(grid,i-1,j);
        dfs(grid,i+1,j);
        dfs(grid,i,j-1);
        dfs(grid,i,j+1);
    }
    
}
