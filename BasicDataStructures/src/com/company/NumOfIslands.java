package com.company;

public class NumOfIslands {

    public static void main(String[] args) {
        char[][] grid = new char[][]{
                {'1','1','1','1','0'},
                {'1','1','0','1','0'},
                {'1','1','0','0','0'},
                {'0','0','0','1','1'}};
        int x = numIslands(grid);
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                System.out.print(grid[i][j]);
            }
            System.out.println();
        }
        System.out.println(x);
    }


    public static void dfs(char[][]grid,int x,int y){
        if(x<0 || y<0 || x >= grid.length || y>=grid[0].length || grid[x][y]!='1'){
            return;
        }

        grid[x][y] = '2';

        dfs(grid,x+1,y);
        dfs(grid,x,y+1);
        dfs(grid,x-1,y);
        dfs(grid,x,y-1);
    }

    public static int numIslands(char[][] grid) {
        int numOfIslands = 0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]=='1'){
                    dfs(grid,i,j);
                    numOfIslands++;
                }
            }
        }
        return numOfIslands;
    }
}
